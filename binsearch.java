/*
���ߣ�ѩ
ʱ�䣺2015��5��13��
���ܣ��۰����
˼·��1.�۰���ҵ�ǰ������������� 
			2.�۰���Ҿ��ǽ�һ������ȥmin��max�½Ǳ꣬Ȼ��Ҫ���ҵ������м�������жԱ�
			3.��������м�����ʹӺ�һ����м俪ʼ���ң�����һ��һ��Ľ��в���
���裺
			1.дһ�������۰���ҵķ���
			2.������Ҫ��min max mid 
			3.�����������ݺ������е��м��Ԫ�ؽ��жԱȣ�
			4.�������ڵ��½Ǳ�
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
			//�������һ�����������Ҫô����min=max����mid��Ҫô���Ƿ���-1ֵ
					int min=0;
					int max=arry.length-1;		
					int mid;	
					while(min<=max)
					{
						//����仰д��ѭ����һ�µļ����жϾͿ��Բ���л��
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
										//�۰��������ҵ��Ļ��϶�����һ���м�ֵ��
										//�϶���min=max�����Բ�����ôѭ����������
										//������Ŀ϶���mid==max�������
										return mid;
										}
								
					}
					return -1;
		}
	}