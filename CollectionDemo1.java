import java.util.*;
/*
		collection集合
		。。。本例中主要讲的就是ArrayList
		ArrayList：底层数据结构使用的是数组结构，查询容易，
*/
class CollectionDemo1
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		ArrayList as=new ArrayList();
		//添加元素
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
	//获取元素的长度 含函数size（）；
	//sop(al.size());
	//3.删除元素
	//al.remove("java02");
	//al.clear();
	//sop(al);
	//判断是否包含java07元素
	//sop("java07"+al.contains("java07"));
	//sop(al.isEmpty());
	//有待考证
	sop(al.retainAll(as));
		
		
		
		}
	public static void sop(Object obj)
	{
			System.out.println(obj);
		}
	}