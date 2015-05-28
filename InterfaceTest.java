abstract class Student
{
	public abstract void study();
	public abstract void sleep();
	}
	
	//这个类即继承了类又是实现接口，所以在实例化的时候就不可以采用多态
class Fore extends Student implements Smoking
{
	public void study()
	{
		System.out.println("Good");		
		}
	public void sleep()
	{
		System.out.println("Pig");
		}
		public void Smok()
		{
			System.out.println("i can smoke!!");
			}
	}
	class Jap extends Student
	{
		public void study()
		{
			System.out.println("ja");
			}
		public void sleep()
		{
			System.out.println("Dog");
			}
		}
		
		interface  Smoking
		{
			 void Smok();

			}
			
	public class InterfaceTest
	{
		public static void main(String[] args)
		{
			Fore f=new Fore();
			f.Smok();
			Student j=new Jap();
			j.study();
			
			}
		}