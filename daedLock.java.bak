/*
需求：死锁的问题

*/

class test implements Runnable
{
	private boolean flag;
	test(boolean flag)
	{
		this.flag=flag;
		}
		public void run()
		{
			if(flag)
			{
				synchronized(MyLock.locka)
				{
					System.out.println(" if Lock a");
					 synchronized(MyLock.lockb)
					 {
					 	System.out.println(" if Lock b");
					 	}
					}
				}
			else
			{
				synchronized(MyLock.lockb)
				{
					System.out.println("else Lock b");
					 synchronized(MyLock.locka)
					 {
					 	System.out.println("else Lock a");
					 	}
					}
				}
			}
	}
	
	//定义两个静态的对象
	class MyLock
	{
		static Object locka=new Object();
		static Object lockb=new Object();
		}
	class daedLock
	{
		public static void main(String[] args)
		{
			Thread t1=new Thread(new test(true));
			Thread t2=new Thread(new test(false));
			t1.start();
			t2.start();
			}
		}