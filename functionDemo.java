/*
ͬ������
ʲô��ͬ��������
	ͬ��������ͬ���������һ���ĵ�����ͬ���������ǽ��������뻻����һ����������ͬ������
	
	ʵ����
		���д�ǮȡǮΪһ��ʵ��
	ע�⣺
		��û������֮ǰ��û��дͬ�����������ͬ��������ʱ���������Ǵ���ģ����ǻ��������200����������100
		����Ҫ��ͬ���Ĵ�������һ���߳�һ���̵߳Ľ���
	д����
		����д��
		һ�־���objsynchronized��object�� ͬ�������
		��һ�־��� ֱ���ں�����д��ͬ������
*/
class Bank
{
	private int sum;
	//Object obj=new Object();
		public synchronized void add(int b)
		{
		//	synchronized(obj)
			//{
			sum+=b;
			System.out.println("sum="+sum);
			//}
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
		class functionDemo
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