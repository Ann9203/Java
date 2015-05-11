/*
作者：雪
时间：2015年5月11号
功能：
	1.通过循环嵌套循环
	2.正三角形
	3.倒三角形
	4.等腰三角形
	4.九九乘法表
*/
public class ForCircle{
	public static void main(String[] args)
	{
		/*
		  *
		  **
		  ***
		  ****
		1.这是一个正着的的三角行
		2.列数，和行数在变化
		3.双重嵌套的循环语句
		*/
		 
		 //行循环
		 for(int x=0;x<=3;x++)
		 {
		 	//列循环
		 	//y随着x的变化而变化
		 	//第x行有x个所以y表示列数，在第x行y列的*数等于x个
		 	//所以y的长度限制是有限的
		 	for(int y=0;y<=x;y++)
		 	{
		 		System.out.print("*");
		 		}
		 		//下一行
		 		System.out.println("");
		 	}
		 		System.out.println("——————————————————————————————————————");
		 	//倒三角形
		 	for(int x=0;x<5;x++)
		 	{
		 		//到三角形就是y的长度和x的长度一样，y每次的大小和x的大小是一样的
		 		for(int y=x;y<5;y++)
		 		{
		 			//println:代表换行
		 			System.out.print("*");
		 			}
		 		System.out.println("");
		 		}
		 		System.out.println("——————————————————————————————————————");
		 		
		 	//等腰三角形
		 	/*
		 	---*
		 	--* *
		 	-* * *
		 	需求：
		 		1.等腰三角形
		 		2.因为它不仅有* ，还有-也是有规律的，所以是循环嵌套
		 		3.他是一个正的三角形*
		 		4.他是一个到的三角形 —
		 		
		 	*/
		 	for(int x=1; x<6;x++)
		 	{
		 		
		 			//-组成的三角形是倒三角形
		 		for(int z=x+1;z<6;z++)
		 		{
		 			System.out.print("-");
		 			}
		 			//y的循环条件的长度是等于X的
		 		for(int y=1;y<=x;y++)
		 		{
		 			System.out.print("* ");
		 			}
		 			System.out.println("");
		 		}
		 		System.out.println("——————————————————————————————————————");
		 		
		 		
		 		/*
		 		需求：九九乘法表，和正三角形的道理是一样的
		 		制表符：\t;
		 		*/
		 		
		 		for(int x=1; x<=9;x++)
		 		{
		 			for(int y=1;y<=x;y++)
		 			{
		 				System.out.print(x+"*"+y+"="+x*y+"\t");
		 				}
		 			System.out.println(" ");
		 			}
		 		
		}
	}