
/*
charAt:������ǻ�ȡstr�ַ����е��Ǹ��ַ�
*/
class Trim
{
	public static void sop(String str)
	{
		System.out.println(str);
		}
		public static void StringMyTrim(String str)
		{
			int start=0;
			int end=str.length()-1;
			//��ʼλ��ҪС�ڽ�������ְ��ͬʱҪ���ַ���str��Ѱ��Ϊ�յ��ַ�
			//˫���ź͵����ŵ����𣬵����Ŵ���ľ���һ���ַ�һ���ַ�
			//˫�������ַ����������ʱ��ʹ��˫���Ż�������Ͳ�ƥ��
			while(start<=end &&str.charAt(start)==' ')
			{
				start++;
				while(start<=end && str.charAt(end)==' ')
				{
					end--;
					}
				}
				//subString��ƴ���ַ�����1,4����ƴ�Ӵ�1��ʼ���ǲ�����4���ַ���
				//ע����д�ĸ�ʽ
				System.out.println(str.substring(start,end+1));
			}
	}
	class StringTrim
	{
		public static void main(String[] args)
		{
			String str="     a,b,c,    ";
			Trim.StringMyTrim(str);
			}
		}