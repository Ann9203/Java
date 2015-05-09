/*
作者：雪
日期：2015年5月8号
功能：通过if语句实现星期，季节
步骤：
	1.建立一个ifTest的类
	2.写一个主函数
	3.if语句
*/
class IfTest{
	public static void main(String[] args){
		
		/*
		int day=3;
		//需求：3.4.5 为春季；678 为夏季；91011 为秋季；1212 为冬季
		//if 语句进行判断
		if(day>=3&&day<=5)
			{
				System.out.println(day+"月为春季");
				}
		else if(day>=6&&day<=8)
			{
				System.out.println(day+"月为夏季");
				}
		else if(day>=9&&day<=11)
			{
				System.out.println(day+"月为秋季");
				}
		else if(day>12&&day<1)
			{
				System.out.println("此季节不存在");
				}
		else
			{
				System.out.println(day+"月为冬季");
				}
				*/
			int month=4;
			//需求：星期
			if(month==1)
				{
					System.out.println("SunDay");
					}
			else if(month==2)
				{
					System.out.println("MonthDay");
					}
			else if(month==3)
				{
					System.out.println("TuesDay");
					}
			else
				{
					System.out.println("NONO");
					}
				
		}
	
	}