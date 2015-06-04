
import java.util.*;
class IteratorDemo
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("java01");
		al.add("java-0");
		al.add("java09");
		al.add("java02");
		al.add("java90");
		al.add("java00");
		Iterator it=al.iterator();
		sop(it.hasNext());
		while(it.hasNext())
		{
			
			  sop(it.next());
			}
		
		
		}
		public static void sop(Object obj)
		{
			System.out.println(obj);
			}
	}