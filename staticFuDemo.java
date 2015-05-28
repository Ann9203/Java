/*
静态的同步函数的特点
静态函数所使用的成员变量也要是静态的
静态代码块：
	静态代码块  中的obj是一个对象，而静态的引用确实不需要对象的只需要文件码的类名就可以了
*/
class Bank
{
	private static  int sum;
	//Object obj=new Object();
		public  static void add(int b)
		{
			synchronized(Bank.class)
			{
			sum+=b;
			System.out.println("sum="+sum);
			}
		}
	}
	class CUs implements Runnable
	{
		Bank b=new Bank();
		public void run()
		{
			for(int x=0;x<3;x++)
			{
				b.add(100);
				}
			}
		}
		class staticFuDemo
		{
			public static void main(String[] args)
			{
				CUs c=new CUs();
				Thread t=new Thread(c);
				Thread t1=new Thread(c);
				t.start();
				t1.start();
				}
			}