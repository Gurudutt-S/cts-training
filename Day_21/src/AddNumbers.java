import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		int num1,num2;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("enter second num: ");
		num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("sum:  "+sum);
	}

}
