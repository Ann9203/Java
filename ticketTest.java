/*
	���󣺴�����Ʊ
	���裺
		1.Ҫ�д���
		2.��ͬ������ Ʊ��
		
*/
//����һ���̳�Thread��ͬʱʹ�þ�̬����static���ǻ��ǳ�����100�ŵ�����Ʊ����������Ҫ����
class Demo extends Thread
{
	private String name;
	private static  int ticket=100;
	Demo(String name)
	{
		this.name=name;
		}
	public void run()
	{
		while(true)
		{
			for(int x=1;x<=ticket;x++)
			{
				System.out.println(this.getName()+"ticket="+ticket);
				ticket--;
			}
			
			}
		}
	}
	class ticketTest
	{
		public static void main(String[] args)
		{
			Demo d=new Demo("1");
			Demo d1=new Demo("2");
			d.start();
			d1.start();
			}
		}