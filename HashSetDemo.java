import java.util.*;
/*
set元素的无序 元素不可以重复
	hasset:底层是hash表
	    保证元素不重复：
	    	Hascode   Equals两个方法
	    	先判断HashCode，如果相同在判断Equals
*/
class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet ha=new HashSet();
		ha.add("java01");
		ha.add("java01");
		ha.add("java02");
		ha.add("java03");
		System.out.println(ha);
		}
	}