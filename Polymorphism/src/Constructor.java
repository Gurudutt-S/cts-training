
public class Constructor {

	public static void main(String[] args) {
	Human human=new Human();
	Human hum=new Human(2,3);
	hum.display();
	}

}
class Human
{
	int a,b;
	public Human()//default counstructor
	{
		System.out.println("I am called Automatically");
	}
	public Human(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parameterised Constructor");
	}
	public void display()
	{
		System.out.println("a: "+a+ "	b: "+b);
	}
}