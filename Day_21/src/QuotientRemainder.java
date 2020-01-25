import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		int num1,num2;
		System.out.println("enter the num:");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("enter the num: ");
		num2=sc.nextInt();
		int remainder=num1%num2;
		int quotient=num1/num2;
		System.out.println("Quotient: "+quotient+"  Remainder: "+remainder);

	}

}
