/*
��̬��ͬ���������ص�
��̬������ʹ�õĳ�Ա����ҲҪ�Ǿ�̬��
��̬����飺
	��̬�����  �е�obj��һ�����󣬶���̬������ȷʵ����Ҫ�����ֻ��Ҫ�ļ���������Ϳ�����
*/
class Bank
{
	private static  int sum;
	//Object obj=new Object();
		public  static void add(int b)
		{
			synchronized(Bank.class)
			{
			sum+=b;
			System.out.println("sum="+sum);
			}
		}
	}
	class CUs implements Runnable
	{
		Bank b=new Bank();
		public void run()
		{
			for(int x=0;x<3;x++)
			{
				b.add(100);
				}
			}
		}
		class staticFuDemo
		{
			public static void main(String[] args)
			{
				CUs c=new CUs();
				Thread t=new Thread(c);
				Thread t1=new Thread(c);
				t.start();
				t1.start();
				}
			}