class Test{
	public void display()
	{
		System.out.println("hello");
	}
}


public class AnonimousClassConcrete {

	public static void main(String[] args) {
		Test t=new Test()
		{
			public void display()
			{
				System.out.println("Good Morning");
			}
		};
		t.display();

	}

}


