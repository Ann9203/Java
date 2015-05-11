/*
作者：雪
时间：2015年5月11号
功能：
	数组初步认识。。。
	数组的便利
*/
public class ArryTest{
	public static void main(String[] args)
	{
		//数据类型  初始化一个数组对象长度为4,数组元素类型为int类型
		//int[] arr=new int[4];
		int arr[]={1,5,6,8};
		//arr[1]=2;
    //arr[2]=4;
		System.out.println(arr[1]);
		
		for (int x=0;x<arr.length;x++)
		{
			System.out.println("arr["+x+"]="+arr[x]);
			}
		}
		
		
	}