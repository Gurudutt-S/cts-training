
public class LocalInnerClass {

	public static void main(String[] args) {
		Out outer=new Out();
		Out.Inn inner=outer.new Inn();//Creating local inner class object
		inner.display();

	}

}


class Out
{
	static int x=10;
	int y=20;
	
	class Inn{
		public void display()
		{
			System.out.println(x);
		}
	}
}
