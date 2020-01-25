import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long num,sum=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number: ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			sum=sum*i;
		}
		System.out.println("Factorial:  "+sum);

	}

}
