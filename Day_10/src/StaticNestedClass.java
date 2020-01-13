
public class StaticNestedClass {

	public static void main(String[] args) {
		Outer.Inner inner=new Outer.Inner();
		inner.display();

	}

}


class Outer
{
	static int x=10;
	int y=20;
	
	static class Inner{
		public void display()
		{
			System.out.println(x);
			//System.out.println(y); // y cannot be accessed because it is not a static member. Only a static class can access a static member.
		}
	}
}