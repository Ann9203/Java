/*
��֮ǰ�Ĵ�������Ż�

*/
class Student
{
	//public  String name;
	//public  String sex;
	public 	boolean flag=false;
	private String name;
	private String sex;
	//�п����̵߳����ִ�е�this��name��ֹͣ�ˣ�����Ҫ����
	public synchronized void set(String name,String sex) //�õ���this ��
	{
		if(flag)
			try{this.wait();}catch(Exception e){}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
		}
	public synchronized  void get()
	{
		if(!flag)
			try{this.wait();}catch(Exception e){}
		System.out.println(name+"............."+sex);
		flag=false;
		this.notify();
		}
	
	}
class Input implements Runnable
{
	//Ҫ�����Դ����Ҫ����Դ�Ķ���
	//Student s=new Student();
	Student s;

	Input(Student s)
	{
		this.s=s;
		}
	public void run()
	{
		//���x��ѭ���еĻ�����ôx��ֵ�ͻ�һֱ��0������Ӧ�ð�x��ֵ���Ե������
		 int x=0;	
		while(true)
		{
			//��������ʹ�ô��õ�������һֱ��
			//����Ŀǰ����һ��������ǣ���һ��������һ�����ݣ������Ǵ�ü������ݣ�Ȼ�����úü�������
			//�������ھ���������ݿ��е�״̬Ϊfalse�Ļ��Ϳ�ʼ�洢���ݣ������true�Ļ���Ҫ�ȴ�һ��
			//����Ƕ�׵�����Ҫ��ʾ������r����ʾ������ͨ��s���󷢳�������
			///synchronized(s)
			//{
					//������Ϊ��Ļ���������ȴ�һ��
					//if(s.flag)
						//try{s.wait();}catch(Exception e){}
						//���Ϊ�پ�Ҫд�����ݣ�ͬʱ����flag��״̬Ϊtrue
			//����������䶼�ŵ��˹��������У������Ļ����˴���
					if(x==0)
						{
							s.set("Hello","man");
							//s.name="Hello";
							//s.sex="man";
							}
							else
							{
								s.set("С��","��");
								//s.name="С��";
								//s.sex="��";
								}
							x=(x+1)%2;
							//s.flag=true;
							//s.notify();
				//}					
		}		
	}
	
	}
class Output implements Runnable
{
	//��Ȼ˵��Ŷ�Ҫ������Դ���������ǵ���ԴӦ����һ�������ǵ�����New������������Ȼ����������������Դ��
	//Ҫ���������������ķ��������֣�
	//��һ�֣�ʹ�õ���ģʽ��ֻ���𴴽�һ��������һ�־��Ǿ�̬�����Ǿ�ֻ̬�е�����������Դ����
	//�����֣��ֽ���Դ�������룬��������ú������ַ����Ȼ���ٳ�ʼ��
	//Student s=new Student();
	Student s;
	Output(Student s)
	{
		this.s=s;
		}
	public void run()
	{
		while(true)
		{
			//synchronized(s)
			//{
				//������ݿ���Ϊ��֤����û����Դ����ȡ��
				//if(!s.flag)
					//try{s.wait();}catch(Exception e){}
				//System.out.println(s.name+"..............."+s.sex);
				//s.flag=false;
			//	s.notify();
			//}
			s.get();
		}
	}
}
	class PVDemo2
	{
		public static void main(String[] args)
		{
			Student s=new Student();
			Input in=new Input(s);
			Output ou=new Output(s);
			Thread t1=new Thread(in);
			Thread t2 =new Thread(ou);
						t1.start();
						t2.start();
			}
		}