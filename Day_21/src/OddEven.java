import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int num1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num: ");
		num1=sc.nextInt();
		
		if(num1==0) {
			System.out.println("number is 0");
		}
		else if(num1%2==0) {
			System.out.println("numner is even: "+num1);
		}
		else {
			System.out.println("number is odd: "+num1);
		}
			

	}

}
