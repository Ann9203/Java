/*
作者：雪
时间：2015年5月13号
功能：折半查找
思路：1.折半查找的前提就是有序数组 
			2.折半查找就是讲一个数组去min和max下角标，然后将要查找的数从中间的数进行对比
			3.如果大于中间的数就从后一半的中间开始查找，这样一半一半的进行查找
步骤：
			1.写一个关于折半查找的方法
			2.变量需要：min max mid 
			3.传进来的数据和数组中的中间的元素进行对比，
			4.返回所在的下角标
*/
public class binsearch
{
	public static void main(String[] args)
	{
		
		int arry[]={1,3,5,7,8,9};
		int mid=binSearch_1(arry,2);
		System.out.println(mid);
		}
		
		public static int binSearch_1(int arry[],int search)
		{
			//这个方法一共两个结果，要么就是min=max返回mid；要么就是返回-1值
					int min=0;
					int max=arry.length-1;		
					int mid;	
					while(min<=max)
					{
						//讲这句话写在循环中一下的几句判断就可以不用谢了
							mid=(min+max)/2;
							//if(arry[mid]==search)
							//{
								//mid=mid;
								//mid=(min+max)/2;
								//}
							 if(arry[mid]>search)
								{
										max=mid-1;
								   // mid=(min+max)/2;
								
									}
								else if(arry[mid]<search)
								{
									min=mid+1;
							
									}
									else
									{
										//折半查找如果找到的话肯定就是一个中间值，
										//肯定是min=max，所以不管怎么循环，最终找
										//到结果的肯定是mid==max这个条件
										return mid;
										}
								
					}
					return -1;
		}
	}