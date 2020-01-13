
public class PolymorphismDemo {
	public static void main(String[] args)
	{
		Area area=new Area();
		area.area(2);
	}
	
}

class Area
{
	public static final double pi=3.14;
	public void area(double a)
	{
		System.out.println("area of square: "+a*a);
	}
	public void area(double a, double b)
	{
		System.out.println("area of rectangle:"+a*b);
	}
	public void area(int a, int b)
	{
		System.out.println("area of triangle:"+a*b/2);
	}
	public void area(int a)
	{
		System.out.println("area of circle:"+pi*a*a);
	}
}

