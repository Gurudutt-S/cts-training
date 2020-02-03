import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//not maping method...this is a program to sort in array;


public class MapDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(12,5,22,53,12,1,123));
		System.out.println("Before Sorting:");
		System.out.println(list);
		
		//Collection class....
		
		System.out.println("After sorting:");
		Collections.sort(list); //Uses merge Sort.
		System.out.println(list);
		
	}

}
	