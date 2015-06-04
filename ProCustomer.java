import java.util.concurrent.locks.*;
/*
	�����ߺ������ߵ�����
	һ�������߶�Ӧһ��������
	���ֵ����⣺
		1.��д��ʽ������
		2.notify �� wait���������Ķ������this
		3.�������ݵ�ʱ��Ҫ�ı�flag��ֵ��Ȼ���������
		4.���캯��Ҫд
	����
		���ֻ��һ��������һ�������ߣ����������һ�������ߣ����������������
		PV���������ѻ���
	���ֵ����⣺
		����̳߳����˲�ͬ��������
	����ķ�����
	 1.���ֶ�������������ߵ�ʱ������Ӧ��ʹ��whileѭ����䣬��Ϊÿһ�ε����ʹ��if�Ļ����ͻ��������ִ�У�������ȥ�ж��Ƿ���ֵ��������
	 		����Ӧ��ʹ��ѭ����������������һ������еȴ�������������֮��Ҫ���´�ͷ��ʼ�ж�һ��
		JDK1.5�г��ֵ��µ�Lock����
			Private Lock lock=new ReentrantLock����
			Private Condition condition_pro=lock.newCondition();
			Private Condition condition_con=new lock.newcondition();
		ע�⣺
			import�������Ҫ�������
		
*/


class resource
{
	private String name;
	private int count=0;
	private boolean flag=false;
	//����һ��lock�� �൱�� synchronized
	private Lock lock=new ReentrantLock();
	
	//����һ���࣬������object�е�wait notify���ȷ���
	private Condition condition_pro=lock.newCondition();
	private Condition condition_con=lock.newCondition(); 
	public  void set(String name)throws InterruptedException
	{
			lock.lock();
			try{
				//��������ߺ�������Ҫʹ��whileѭ����������ʹ����߳����±ߵȴ���ֻҪ��whileѭ��һ����Ҫ���¿�ʼ��������
					while(flag)
					 condition_pro.await();
				 this.name=name+"-------"+count++;
				 System.out.println(Thread.currentThread().getName()+"������="+this.name);
				 flag=true;
				 //this.notifyAll();
				 condition_con.signal();
			}
			finally
			{
				lock.unlock();
				}
		}
		public  void get() throws InterruptedException
		{
			lock.lock();
			try{
					while(!flag)
						condition_con.await();
					System.out.println(Thread.currentThread().getName()+"������="+"................"+this.name);
					flag=false;
					//this.notifyAll();
					condition_pro.signal();
			}
			finally
			{
				lock.unlock();
				}
		}
	
	}
	class product implements Runnable
	{
		 resource r =new resource();
			product(resource r)
			{
				this.r=r;
				}
		
				public void run()
				{
					
					int x=0;
					
					while(true)	
					{
						try{		
							if(x==0)
								{r.set("xiaohong");}
							else
								{r.set("���");}
							x=(x+1)%2;
						}
						
						catch(InterruptedException e)
						{
							}
					}
				}
		}
		
		class customer implements Runnable
		{
			resource r=new resource();
			customer(resource r)
			{
				this.r=r;
				}
			public void run()
			{
				
				
				while(true)
					{
						try{
						r.get();							
					}
					catch(InterruptedException e)
					{}
					}
				}
			}
			class ProCustomer
			{
				public static void main(String[] args)
				{
					resource r=new resource();
					Thread t1=new Thread(new product(r));
					Thread t2=new Thread(new customer(r));
					Thread t3=new Thread(new customer(r));
					Thread t4=new Thread(new product(r));
					Thread t5=new Thread(new customer(r));
					Thread t6=new Thread(new product(r));
					t1.start();
					t2.start();
					t4.start();
					t3.start();
					t5.start();
					t6.start();
					
					}
				}