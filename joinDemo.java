/*
����ִ��Ȩ
*/
class Demo implements Runnable
{
	public void run()
	{
		for(int x=0;x<70;x++)
			{
				System.out.println(Thread.currentThread().getName()+"x="+x);
				}
		}
	}
	class joinDemo
	{
		public static void main(String[] args)
		{
			Demo d=new Demo();			
			Thread t1=new Thread(d);
			Thread t2=new Thread(d);
			t1.start();
			
			
			t2.start();
			for(int x=0;x<70;x++)
			{
				try{t1.join();}catch(InterruptedException e){}
				System.out.println("main....."+x);
				}
				for(int x=0;x<70;x++)
					{
						System.out.println("main....."+x);
						}
				for(int x=0;x<70;x++)
					{
						System.out.println("main....."+x);
						}
			}
		}