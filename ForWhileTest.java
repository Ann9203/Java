/*
作者：雪
日期：2015年5月11日
功能：通过for while 循环来写出1-10的和
*/

public class ForWhileTest{
	
	public static void main(String[]args){
		/*运用while
		int x=0;
		int sum=0;
		//循环相加sum为和
		while(x<=10)
		{
			sum+=x;
			x++;
			}
		System.out.println(sum);
		*/
		/*  使用for*/
		
		int sum=0;
		for(int x=0;x<=10;x++)
			{
					sum+=x;
				}
			System.out.println(sum);
		} 
	}