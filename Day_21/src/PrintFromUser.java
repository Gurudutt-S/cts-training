import java.util.Scanner;

public class PrintFromUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String userInput=sc.nextLine();
		System.out.println("the entered string is:  "+userInput);
	}

}
