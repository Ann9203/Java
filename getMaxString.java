/*
���ն̵��ַ�������ѭ���ıȽ�
ÿѭ��һ�ο���ʣ����ַ�����û�з���Ҫ���
*/
class getMaxString
{
	public static String getMaxCount(String s1,String s2)
	{
		String max="",min="";
		max=s1.length()>s2.length()?s1:s2;
		min=(max==s1)?s2:s1;
		for(int x=0;x<min.length();x++)
		{
			for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++)
			{
				String temp=min.substring(y,z);
				sop(temp);
				if(max.contains(temp))
				{
					sop(temp);
					return temp;
					
					}
				}
			}
			return "";
		}
		public static void sop(String s)
		{
			System.out.println(s);
			}
		
		public static void main(String[] args)
		{
			String s1="sfhdjklhhellojkjks";
			String s2="hsdhellodjks";
			getMaxCount(s1,s2);
			}
	}