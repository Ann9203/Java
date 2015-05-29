/*
对之前的代码进行优化

*/
class Student
{
	//public  String name;
	//public  String sex;
	public 	boolean flag=false;
	private String name;
	private String sex;
	//有可能线程到这里，执行到this。name就停止了，所以要枷锁
	public synchronized void set(String name,String sex) //用的是this 锁
	{
		if(flag)
			try{this.wait();}catch(Exception e){}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
		}
	public synchronized  void get()
	{
		if(!flag)
			try{this.wait();}catch(Exception e){}
		System.out.println(name+"............."+sex);
		flag=false;
		this.notify();
		}
	
	}
class Input implements Runnable
{
	//要想放资源首先要有资源的对象
	//Student s=new Student();
	Student s;

	Input(Student s)
	{
		this.s=s;
		}
	public void run()
	{
		//如果x在循环中的话，那么x的值就会一直是0，所以应该吧x的值调试到外边来
		 int x=0;	
		while(true)
		{
			//加上锁，使得存拿的数据是一直的
			//但是目前还有一个问题就是：存一个数据拿一个数据，而不是存好几个数据，然后再拿好几个数据
			//所以现在就是如果数据库中的状态为false的话就开始存储数据，如果是true的话就要等待一下
			//锁是嵌套的所以要表示锁，用r来标示，都是通过s对象发出的命令
			///synchronized(s)
			//{
					//如果标记为真的话，就让其等待一下
					//if(s.flag)
						//try{s.wait();}catch(Exception e){}
						//如果为假就要写入数据，同时更改flag的状态为true
			//将上锁的语句都放到了共享数据中，这样的话简化了代码
					if(x==0)
						{
							s.set("Hello","man");
							//s.name="Hello";
							//s.sex="man";
							}
							else
							{
								s.set("小明","男");
								//s.name="小明";
								//s.sex="男";
								}
							x=(x+1)%2;
							//s.flag=true;
							//s.notify();
				//}					
		}		
	}
	
	}
class Output implements Runnable
{
	//虽然说存放都要引入资源，但是他们的资源应该是一个，我们的这种New的做法，很显然是两个对象，两个资源，
	//要想避免是两个对象的方法有两种：
	//第一种：使用单利模式，只让起创建一个对象，另一种就是静态，但是静态只有到最后才能让资源消耗
	//第三种：现将资源对象引入，就像是拉煤，将地址引入然后再初始化
	//Student s=new Student();
	Student s;
	Output(Student s)
	{
		this.s=s;
		}
	public void run()
	{
		while(true)
		{
			//synchronized(s)
			//{
				//如果数据库中为假证明还没有资源可以取到
				//if(!s.flag)
					//try{s.wait();}catch(Exception e){}
				//System.out.println(s.name+"..............."+s.sex);
				//s.flag=false;
			//	s.notify();
			//}
			s.get();
		}
	}
}
	class PVDemo2
	{
		public static void main(String[] args)
		{
			Student s=new Student();
			Input in=new Input(s);
			Output ou=new Output(s);
			Thread t1=new Thread(in);
			Thread t2 =new Thread(ou);
						t1.start();
						t2.start();
			}
		}