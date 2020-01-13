
public class GlobalwarmingString {

	public static void main(String[] args) {
		String name="Global Warming";
		int len=name.length()-4;
		System.out.println("a.\t"+name.substring(len));
		
		System.out.println("b.\t"+name.substring(4,9));
		
		System.out.println("c.\t"+ name.matches("[a-zA-Z0-9]"));
		
		System.out.println("d:\t" +name.replaceAll(name.substring(len)," "));
		
		System.out.println("e:\t"+name.substring(4));
		
		System.out.println("f:\t"+name.indexOf("Wa"));
		
		int ln=name.length();
		for(int i=0;i<ln;i++)
		{
			
		}
		System.out.println("g.\t" );
		
		System.out.println("h:\t" );
		
		System.out.println("i:\t"+name.replaceAll("a", "*"));
	}

}
