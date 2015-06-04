/*
停止线程的使用
stop线程已经过时；
另一种解决的方法：
	就是迫使run方法停止
	使用interrupt迫使run方法中的循环停止
*/
class stop implements Runnable
{
	private boolean flag;
	public void run()
	{
			while(true)
			{
				try
				{
					wait();
					}
					catch(InterruptedException e)
					{
						System.out.println("线程终止，需要重启");
						flag=false;
						}
					System.out.println("run,while循环");
				}
		}
	}
	class stopline
	{
		public static void main (String[] args)
		{
			int x=0;
			stop s=new stop();
			Thread t1=new Thread(s);
			Thread t2=new Thread(s);
		
			while(true)
			{
				if(x++==60)
				{
					t1.interrupt();
					t2.interrupt();
					break;
					}
					System.out.println(x);
				}			
				System.out.println("over");
			}
			
		}