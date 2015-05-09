/*
作者：雪
日期：2015年5月8号
功能：通过if语句实现星期，季节
步骤：
	1.建立一个ifTest的类
	2.写一个主函数
	3.swichTest
*/
class SwichTest{
	public static void main(String[] args){
		//注意单词拼写
		//多条语句一样子。。。。。
		int month=4;
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println(month+"月为春季");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println(month+"月为夏季");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.println(month+"月为秋季");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.println(month+"月为冬季");
				break;
				
			default:
				System.out.println("没有这个季节");
				break;
			
			}
		}
	}