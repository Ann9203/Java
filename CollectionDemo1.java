import java.util.*;
/*
		collection����
		��������������Ҫ���ľ���ArrayList
		ArrayList���ײ����ݽṹʹ�õ�������ṹ����ѯ���ף�
*/
class CollectionDemo1
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		ArrayList as=new ArrayList();
		//���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		al.add("java05");
		
		as.add("java09");
		as.add("java00");
		as.add("java08");
		as.add("java05");
		
		
		
	//	sop(al);
	//��ȡԪ�صĳ��� ������size������
	//sop(al.size());
	//3.ɾ��Ԫ��
	//al.remove("java02");
	//al.clear();
	//sop(al);
	//�ж��Ƿ����java07Ԫ��
	//sop("java07"+al.contains("java07"));
	//sop(al.isEmpty());
	//�д���֤
	sop(al.retainAll(as));
		
		
		
		}
	public static void sop(Object obj)
	{
			System.out.println(obj);
		}
	}