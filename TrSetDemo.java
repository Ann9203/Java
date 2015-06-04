
import java.util.*;
/*
	TreeSet：底层数据结构是二叉树
		可以对Set集合中的元素进行排序
		保证元素唯一性的依据：
			compareTo 方法返回0
			TreeSet第一种排序的方式，让元素的自身具备比较性
			元素需要实现Comparable接口，覆盖CompareTo方法
	
	一个学生类，
	根据学生的信息对学生进行排序
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
					  throw new RuntimeException("不是学生");
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
	
