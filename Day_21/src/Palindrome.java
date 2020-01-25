import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num,rem,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		int n=num;
		while(n!=0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(num==sum) {
			System.out.println("palindrome");
		}else
		{
			System.out.println("not palindrome");
		}

	}

}
