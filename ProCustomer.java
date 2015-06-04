import java.util.concurrent.locks.*;
/*
	生产者和消费者的问题
	一个生产者对应一个消费者
	出现的问题：
		1.书写格式的问题
		2.notify 和 wait都有所属的对象就是this
		3.存入数据的时候要改变flag的值，然后进行提醒
		4.构造函数要写
	需求：
		这个只是一个生产者一个消费者，如果我们有一个生产者，两个消费者如何做
		PV操作，唤醒机制
	出现的问题：
		多个线程出现了不同步的现象
	解决的方法：
	 1.出现多个生产者消费者的时候，我们应该使用while循环语句，因为每一次的如果使用if的话，就会继续向下执行，而不会去判断是否有值，真假如何
	 		所以应该使用循环，不管现在在哪一步骤进行等待，当被唤醒了之后都要重新从头开始判断一下
		JDK1.5中出现的新的Lock方法
			Private Lock lock=new ReentrantLock（）
			Private Condition condition_pro=lock.newCondition();
			Private Condition condition_con=new lock.newcondition();
		注意：
			import这个引用要放在最顶部
		
*/


class resource
{
	private String name;
	private int count=0;
	private boolean flag=false;
	//定义一个lock锁 相当于 synchronized
	private Lock lock=new ReentrantLock();
	
	//定义一个类，顶替了object中的wait notify，等方法
	private Condition condition_pro=lock.newCondition();
	private Condition condition_con=lock.newCondition(); 
	public  void set(String name)throws InterruptedException
	{
			lock.lock();
			try{
				//多个生产者和消费者要使用while循环，这样即使多个线程在下边等待，只要有while循环一定是要从新开始进行运行
					while(flag)
					 condition_pro.await();
				 this.name=name+"-------"+count++;
				 System.out.println(Thread.currentThread().getName()+"生产者="+this.name);
				 flag=true;
				 //this.notifyAll();
				 condition_con.signal();
			}
			finally
			{
				lock.unlock();
				}
		}
		public  void get() throws InterruptedException
		{
			lock.lock();
			try{
					while(!flag)
						condition_con.await();
					System.out.println(Thread.currentThread().getName()+"消费者="+"................"+this.name);
					flag=false;
					//this.notifyAll();
					condition_pro.signal();
			}
			finally
			{
				lock.unlock();
				}
		}
	
	}
	class product implements Runnable
	{
		 resource r =new resource();
			product(resource r)
			{
				this.r=r;
				}
		
				public void run()
				{
					
					int x=0;
					
					while(true)	
					{
						try{		
							if(x==0)
								{r.set("xiaohong");}
							else
								{r.set("红红");}
							x=(x+1)%2;
						}
						
						catch(InterruptedException e)
						{
							}
					}
				}
		}
		
		class customer implements Runnable
		{
			resource r=new resource();
			customer(resource r)
			{
				this.r=r;
				}
			public void run()
			{
				
				
				while(true)
					{
						try{
						r.get();							
					}
					catch(InterruptedException e)
					{}
					}
				}
			}
			class ProCustomer
			{
				public static void main(String[] args)
				{
					resource r=new resource();
					Thread t1=new Thread(new product(r));
					Thread t2=new Thread(new customer(r));
					Thread t3=new Thread(new customer(r));
					Thread t4=new Thread(new product(r));
					Thread t5=new Thread(new customer(r));
					Thread t6=new Thread(new product(r));
					t1.start();
					t2.start();
					t4.start();
					t3.start();
					t5.start();
					t6.start();
					
					}
				}