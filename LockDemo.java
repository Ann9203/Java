/*
ͬ������Ʊ��ʵ����������
ͬ������飬Ҳ��������
��ͬ���Ĵ�����������Ҫ���޹ؽ�Ҫ��ҲҪ����
*/
class ticket implements Runnable
{
	Object obj=new Object();
	public  int tic=100;
	public void run()
		{
				while(true)
				{
					
					//���@�e�����̵߳�ԭ����ǣ�
					//���һ����������������ǡ�0�ģ����������ʱ��tic--��ʱ��ȴ��������еĳ���Ʊ���ߣ���ʱ����������Ȼ���ϴ���0������������Ʊ����ȴ��0
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
	