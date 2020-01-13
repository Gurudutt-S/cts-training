
public class MemberInnerClass {

	public static void main(String[] args) {
			Outer1 outer=new Outer1();
			outer.display();

		}

}


	class Outer1
	{
		
		int x=10;
		public void display()
		{
			class Member{	
				public void show()
				{
					System.out.println(x);
				}
			}
			Member m=new Member();
			m.show();
		}
	}
