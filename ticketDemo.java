/*
需求：窗口买票
方法二：通过实现runnable接口，好处就是在java中主要是单继承，不能多继承，所以如果实现接口，其实还可以继承类
Runnable 要大写
//出现的问题就是出现了4个100号的票
问题的解决方法：
	进行上锁

*/
class ticket implements Runnable
{
	public static int tic=100;
	public void run()
	{
		while(true)
		{
			if(tic>0)
			{
				System.out.println(Thread.currentThread().getName()+"sale-----"+tic);
				tic--;
				}
			}
		}
	}
	class ticketDemo
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