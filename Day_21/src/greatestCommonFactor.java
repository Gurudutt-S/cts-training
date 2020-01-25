import java.util.Scanner;

public class greatestCommonFactor {

	public static void main(String[] args) {
		int a,b,gcd=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println("gcd of "+a+" , "+b+" : "+gcd);
	}

}
