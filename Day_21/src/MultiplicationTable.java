import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num,sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to generate multiplication table: ");
		num=sc.nextInt();
		for (int i=1;i<=10;i++) {
			sum=num*i;
			System.out.println(num+" * "+i+" = "+sum);
		}
	}

}
