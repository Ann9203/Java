/*
同样的买票的实例，加上锁
同步代码块，也就是上锁
将同步的代码上锁，不要吧无关紧要的也要上锁
*/
class ticket implements Runnable
{
	Object obj=new Object();
	public  int tic=100;
	public void run()
		{
				while(true)
				{
					
					//在這裡加上线程的原因就是：
					//如果一个程序进来，正好是》0的，但是输出的时候tic--这时候却被里边运行的程序将票抢走，这时候他进来虽然符合大于0的条件，但是票最终却是0
						synchronized(obj)
					{
						if(tic > 0)
						{
									
										try{Thread.sleep(10);}catch(Exception e){}
									
										System.out.println(Thread.currentThread().getName()+"sale:-----"+tic--);
									
									}
							}
					}
			}
	}
	class LockDemo
	{
		public static void main(String[] args)
		{
			ticket t=new ticket();
			Thread t1=new Thread(t);
			Thread t2=new Thread(t);
			Thread t3=new Thread(t);
			Thread t4=new Thread(t);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			}
		}
	