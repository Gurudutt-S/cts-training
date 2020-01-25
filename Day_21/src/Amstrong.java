import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int num,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		num=sc.nextInt();
		int n=num;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		System.out.println(sum);
		
		if(num==sum) {
			System.out.println("amstrong");
		}else {
			System.out.println("not amstrong");
		}

	}

}
