import java.util.*;
/*
����һ��person�����person���У�������������ͬ��Ԫ�أ�ֻҪ�Ǻ�I������������ȾͿ���
��Ϊ������Ԫ����ͬ
ȡ��Arraylist �����е��ظ�Ԫ�أ�+


*/
class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		}
	public String getName()
	{
		return this.name;
		}
		public int getAge()
		{
			return this.age;
			}
			public boolean equals(Object obj)
			{
				//Ҫ��ArrayListװ�ڶ���Ļ�����������ص���Object
				if(!(obj instanceof Person))
						return false;
						//����ת�ͣ���ΪArrayList���ص���OBject�������ڱ���
						//��Ҫ��Person
				Person p=(Person)obj;
				return this.name.equals(p.name)&&this.age==age;
				
				}
	
	}
class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add(new Person("zhangsan",20));
		ar.add(new Person("zhengbo",22));
		ar.add(new Person("wangwu",14));
		ar.add(new Person("wangwu",14));
		ar=SingArray(ar);
		
		Iterator it =ar.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			//����ת�ͣ���ΪҪ��ȡPerson���е������ͷ�������Щ��Object�в�����
			Person p=(Person)obj;
			System.out.println(p.getName()+","+p.getAge());
			}
		
		
		}
		
		//ȡ��ArrayList����ͬ��Ԫ��
		//����һ���ų���ͬԪ�صķ���
		public static ArrayList SingArray(ArrayList al)
		{
			ArrayList ar=new ArrayList();
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				Object obj=it.next();
				if(!ar.contains(obj))
				{
					ar.add(obj);
					}
				}
				return ar;
			}
	}