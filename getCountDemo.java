/*
取一个字符串在另一个字符串中出现的次数
思路 ：
	定义一个计数器
	获取从kk第一次出现的位置
	从第一次穿线位置后剩余的字符串中基础获取kk出现的位置，没获取一次就计数一次
	当获取不到时候计数完成
*/
class getCount
{
	public static int getSubCount(String str,String key)
	{
				int count=0;
				int index=0;
				while((index=str.indexOf(key))!=-1)
				{
					sop(str);
					//subString:获取字符串中的一部分
					str=str.substring(index+key.length());
					count++;
					}
					return count;
		}
		public static void sop(String str)
		{
			System.out.println(str);
			}
	}
	class getCountDemo
	{
		public static void main(String[] args)
		{
			String str="sdfhhhjsdhhhkjfshhhdfs";
			getCount.sop("count=："+getCount.getSubCount(str,"hhh"));
	  	//System.out.println(	getCount.getSubCount(str,"hhh"));
			}
		}