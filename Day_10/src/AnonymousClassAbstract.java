
public class AnonymousClassAbstract {

	public static void main(String[] args) {
		Demo1 t=new Demo1()
		{
			public void display2()
			{
				System.out.println("Good Morning");
			}
		};
		t.display2();

	}

}

abstract class Demo1{
	abstract public void display2();
	
}
