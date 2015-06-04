
/*
charAt:这个就是获取str字符串中的那个字符
*/
class Trim
{
	public static void sop(String str)
	{
		System.out.println(str);
		}
		public static void StringMyTrim(String str)
		{
			int start=0;
			int end=str.length()-1;
			//开始位置要小于结束的文职，同时要在字符串str中寻找为空的字符
			//双引号和单引号的区别，单引号代表的就是一个字符一个字符
			//双引号是字符串，如果这时候使用双引号会造成类型不匹配
			while(start<=end &&str.charAt(start)==' ')
			{
				start++;
				while(start<=end && str.charAt(end)==' ')
				{
					end--;
					}
				}
				//subString：拼接字符串，1,4，会拼接从1开始但是不包括4的字符串
				//注意书写的格式
				System.out.println(str.substring(start,end+1));
			}
	}
	class StringTrim
	{
		public static void main(String[] args)
		{
			String str="     a,b,c,    ";
			Trim.StringMyTrim(str);
			}
		}