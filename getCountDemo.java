/*
ȡһ���ַ�������һ���ַ����г��ֵĴ���
˼· ��
	����һ��������
	��ȡ��kk��һ�γ��ֵ�λ��
	�ӵ�һ�δ���λ�ú�ʣ����ַ����л�����ȡkk���ֵ�λ�ã�û��ȡһ�ξͼ���һ��
	����ȡ����ʱ��������
*/
class getCount
{
	public static int getSubCount(String str,String key)
	{
				int count=0;
				int index=0;
				while((index=str.indexOf(key))!=-1)
				{
					sop(str);
					//subString:��ȡ�ַ����е�һ����
					str=str.substring(index+key.length());
					count++;
					}
					return count;
		}
		public static void sop(String str)
		{
			System.out.println(str);
			}
	}
	class getCountDemo
	{
		public static void main(String[] args)
		{
			String str="sdfhhhjsdhhhkjfshhhdfs";
			getCount.sop("count=��"+getCount.getSubCount(str,"hhh"));
	  	//System.out.println(	getCount.getSubCount(str,"hhh"));
			}
		}