
import java.util.*;
/*
list:Ԫ��������ģ������ظ��ٸü�����
*/
class ListDemo
{
	public static void main(String[] args)
	{
			ArrayList al=new ArrayList();
			al.add("java1");
			al.add("java2");
			al.add("java3");
			//sop(l);
			//������������������������������в�����Ӧ��Ԫ��Ȼ������Ӧ��λ�ò���Ԫ��
			//��Ȼ�ͻᱨ�����
		//	l.add(2,"java4");
			//l.set(2,"java09");
		//	sop(l);
		
		//ʹ��Iterator������޸ĵ�ʱ��ͻᷢ����������
		//Ӧ��ʹ���������� Listiterator
		/*
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			if(obj.equals("java2"))
				al.add("java08");
			sop(obj);
			}
			*/
			ListIterator li=al.listIterator();
			while(li.hasNext())
			{
					Object obj=li.next();
					if(obj.equals("java2"))
					//�����java2���Ԫ�ؾ������߲���Ԫ��java09
						li.add("java09");
				
				}	
				sop(al);
		}
		public static void sop(Object obj)
		{
			System.out.println(obj);
			}
	}