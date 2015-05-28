/*
需求：
	关于死锁的问题，也就是大家各自拿着一个资源，谁也不撒手，这样就造成了死锁现象
	实例  是售票的实例
	
*/

class Tick implements Runnable
{
				private int ticke=200;
				public boolean flag;
				Object obj=new Object();
					public void run()
					{
							if(flag)
							{
								while(true)
									{
										synchronized(obj)
										{
												show();
										}
									}
								}
									else
								{
									while(true)
									{
										show();
										}
									}
							}
		public synchronized void show()//调用的是this线程
		{
					synchronized(obj)//调用的是obj线程
					{
						if(ticke>0)
						{			
								System.out.println(Thread.currentThread().getName()+"show--------"+ticke--);				
						}
					}
			}
}
class daidLock
{
	public static void main(String[] args)
	{
		Tick t=new Tick();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		//try{Thread.sleep(10);}catch(Exception e){}
		t.flag=false;
		t2.start();
		}
	}
