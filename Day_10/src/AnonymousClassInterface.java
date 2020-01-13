
public class AnonymousClassInterface {

	public static void main(String[] args) {
		Demo t=new Demo()
		{
			public void display3()
			{
				System.out.println("Good Morning");
			}
		};
		t.display3();

	}

}

interface Demo
{
	void display3();
}