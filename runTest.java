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
			//һ���̣߳����������ڽ������У���������Ʊ��һ�����ڽ�1��Ʊ�۳����Ͳ�Ӧ������һ�������ٽ�1��Ʊ�۳�
			Demo d=new Demo("Hello");
			Demo d1=new Demo("Nihao");
			d.start();	
			d1.start();
			
			//for(int i=0;i<70;i++){
				//System.out.println("main"+"i="+i);
				//}
			}
		}