/*
作者：雪
时间：2015年5月11日
功能：选择排序
思路：
	选择排序就是选择出一个元素，然后依次和后边的进行对比
	对比之后，进行交换
	其实和倒三角形差不多
*/
public class SelectSort
{
	//因为是对一个数组进行操作，进行排序，所以不需要有返回值
	public static void Select(int arry[])
	{
		//因为到最后之后，选择排序就不用让最后一个进行对比，排序到最后肯定就已经排序好了所以长度-1
		//外层是选择出一个元素，然后选择完后和内层分别进行对比
		//嵌套循环
		for(int x=0;x<arry.length-1;x++)
		{
			//第一个元素肯定不能和第一个进行比较， 
			for(int y=x+1;y<arry.length;y++)
			{
				if(arry[x]>arry[y])
				{
					int tmp=arry[x];
					arry[x]=arry[y];
					arry[y]=tmp;
					}
				}
			}
		}
		public static void main(String[]args)
		{
			int[] arr={1,2,7,8,34,9,3};
			Print(arr);
			Select(arr);
			Print(arr);
			}
			
			//将打印的语句封装成一个函数
			
		public static void Print(int[] arry)
		{
			for(int x=0;x<arry.length;x++)
			{
				//如果x不是最后一个元素
				if(x!=arry.length-1)
				{
					System.out.print(arry[x]+",");
					}
				else
				{
					System.out.print(arry[x]);
					}
				}
				System.out.println("");
			}
	}