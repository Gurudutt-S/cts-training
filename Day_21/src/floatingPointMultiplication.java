import java.util.Scanner;

public class floatingPointMultiplication {

	public static void main(String[] args) {
		float num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num1=sc.nextFloat();
		System.out.println("enter the number");
		num2=sc.nextFloat();
		float mult=num1*num2;
		System.out.println("Product : "+mult);

	}

}
