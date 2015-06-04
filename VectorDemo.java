import java.util.*;
class VectorDemo
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		v.add("java05");
		//Vector 是枚举似的，也好似迭代器
		Enumeration en=v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
			}
		}
	
	}