/*
���ߣ�ѩ
ʱ�䣺2015��5��11��
���ܣ�ѡ������
˼·��
	ѡ���������ѡ���һ��Ԫ�أ�Ȼ�����κͺ�ߵĽ��жԱ�
	�Ա�֮�󣬽��н���
	��ʵ�͵������β��
*/
public class SelectSort
{
	//��Ϊ�Ƕ�һ��������в����������������Բ���Ҫ�з���ֵ
	public static void Select(int arry[])
	{
		//��Ϊ�����֮��ѡ������Ͳ��������һ�����жԱȣ��������϶����Ѿ�����������Գ���-1
		//�����ѡ���һ��Ԫ�أ�Ȼ��ѡ�������ڲ�ֱ���жԱ�
		//Ƕ��ѭ��
		for(int x=0;x<arry.length-1;x++)
		{
			//��һ��Ԫ�ؿ϶����ܺ͵�һ�����бȽϣ� 
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
			
			//����ӡ������װ��һ������
			
		public static void Print(int[] arry)
		{
			for(int x=0;x<arry.length;x++)
			{
				//���x�������һ��Ԫ��
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