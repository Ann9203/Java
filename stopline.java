/*
ֹͣ�̵߳�ʹ��
stop�߳��Ѿ���ʱ��
��һ�ֽ���ķ�����
	������ʹrun����ֹͣ
	ʹ��interrupt��ʹrun�����е�ѭ��ֹͣ
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
						System.out.println("�߳���ֹ����Ҫ����");
						flag=false;
						}
					System.out.println("run,whileѭ��");
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