/*
����
	�������������⣬Ҳ���Ǵ�Ҹ�������һ����Դ��˭Ҳ�����֣��������������������
	ʵ��  ����Ʊ��ʵ��
	
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
		public synchronized void show()//���õ���this�߳�
		{
					synchronized(obj)//���õ���obj�߳�
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
