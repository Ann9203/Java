
import java.util.*;
/*
list:元素是有序的，可以重复再该集合中
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
			//这个插入带有索引必须现在这个集合中插入相应的元素然后在相应的位置插入元素
			//不然就会报出溢出
		//	l.add(2,"java4");
			//l.set(2,"java09");
		//	sop(l);
		
		//使用Iterator在添加修改的时候就会发生错误所以
		//应该使用它的子类 Listiterator
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
					//如果有java2这个元素就在其后边插入元素java09
						li.add("java09");
				
				}	
				sop(al);
		}
		public static void sop(Object obj)
		{
			System.out.println(obj);
			}
	}