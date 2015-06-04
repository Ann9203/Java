class StringDemo
{
	public static void method_trans()
	{
		char[] arr={'a','b','c','o','p'};
		String s=new String(arr,1,3);
		sop(s);
		String s1="skfjaksldjfksld";
		char[] c=s1.toCharArray();
		for(int x=0;x<c.length();x++)
		{
			sop("c="+c[x]);
			}
		
		}
		public static void sop(String s)
		{
			System.out.println(s);
			}
			public static void main(String[] args)
			{
				method_trans();
				}
			
	}