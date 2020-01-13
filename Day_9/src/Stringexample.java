public class Stringexample{
	public static void main(String[] args)
	{
		Places place=new Places();
		place.display();
		
	}
}

class Places{
	String name="chennai";
	String address="thoraipakkam";
	String name2="chennai";
	String name1=new String("kochi");
	String address1=new String("Avlua");
	String name3=new String("Hydrabad");
	
	public void display(){
		System.out.println(name.equals(name2));
		System.out.println(name==name2);
	}
}