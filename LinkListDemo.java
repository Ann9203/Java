
import java.util.*;
//更具LinkList所具有的特色的方法
//模拟一个堆栈
class duilie
{
	private  LinkedList link;
	duilie()
	{
		link=new LinkedList();
		}
	public void myAdd(Object obj)
	{
		link.addFirst(obj);
		System.out.printlin(link);
	}
	public Object  getElem()
	{
		/*
		while(!isEmpty())
		{
		System.out.println( link.removeLast());
	  }
	 */
	 return link.removeLast();
	  
	} 
		public boolean isNull()
		{
			return link.isEmpty();
			}
	}
	
class LinkListDemo
{
	public static void main(String[] args)
	{
			 duilie d=new duilie();
			 d.myAdd("java01");
			 d.myAdd("java09");
			 d.myAdd("java08");
			 while(!d.isNull())
			 {
			 	System.out.print(d.getElem());
			 	}
	 
	}
	}
