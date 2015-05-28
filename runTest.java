class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		super(name);
		}
	public void run()
	{
		for(int i=0;i<80;i++)
		{
			System.out.println(this.getName()+"i="+i);
			}
		}
	
	}
	
	class runTest
	{
		public static void main(String [] args)
		{
			//一个线程，两个对象在进行运行，就像是售票，一个窗口将1号票售出，就不应该再另一个窗口再将1号票售出
			Demo d=new Demo("Hello");
			Demo d1=new Demo("Nihao");
			d.start();	
			d1.start();
			
			//for(int i=0;i<70;i++){
				//System.out.println("main"+"i="+i);
				//}
			}
		}