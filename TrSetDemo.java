
import java.util.*;
/*
	TreeSet���ײ����ݽṹ�Ƕ�����
		���Զ�Set�����е�Ԫ�ؽ�������
		��֤Ԫ��Ψһ�Ե����ݣ�
			compareTo ��������0
			TreeSet��һ������ķ�ʽ����Ԫ�ص�����߱��Ƚ���
			Ԫ����Ҫʵ��Comparable�ӿڣ�����CompareTo����
	
	һ��ѧ���࣬
	����ѧ������Ϣ��ѧ����������
*/
/*
class Student implements Comparable
{
	private String name;
	private int age;
	Student(String name,int age)
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
			public int compareTo(Object obj)
			{
				if(!(obj instanceof Student))
					  throw new RuntimeException("����ѧ��");
				Student s=(Student)obj;
				if(this.age>s.age)
					return 1;
				if(this.age==s.age)
					return this.name.compareTo(s.name);
				return -1;
				}			
	}
	*/
	class TrSetDemo
	{
		public static void main(String[] args)
		{
				TreeSet ts=new TreeSet();
				ts.add(new Student("zhangshan",23));
				ts.add(new Student("wangwu",23));
				ts.add(new Student("lili",28));
				
				Iterator it=ts.iterator();
				while(it.hasNext())
				{
					Object obj=it.next();
					Student s=(Student)obj;
					System.out.println(s.getName()+","+s.getAge());
					
					}
			}
		
		}
	
