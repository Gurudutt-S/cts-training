import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {
	
	//it is used with collections and return us the modified collection.
	//based on certain conditions we get the results.
	//1. filter-->it filter the collection object and return another collection based on a condition.
	//2. Map--> it will return the complete set of objects after modification.

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		addNames(names);
		
		names.forEach(System.out::println);

		//print all names with length more than 7
		List<String> lengthScale= names.stream().filter(name ->name.length()>7).collect(Collectors.toList());
		System.out.println("Names with length greater than 7: \n");
		lengthScale.forEach(System.out::println);
		
		//print all names in capital letter
		List<String> capNames= names.stream().map(name ->name.toUpperCase()).collect(Collectors.toList());
		System.out.println("Names in capital lettters: \n");
		capNames.forEach(System.out::println);
		
	}
	
	private static void addNames(List<String> names)
	{
		names.add("Abin Joshy");
		names.add("Sai Krishna");
		names.add("Aniket Andhale");
		names.add("xvfasd");
		names.add("mhka");
	}

}
