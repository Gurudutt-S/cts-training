import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		int num,flag=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the num:");
		num=sc.nextInt();
			for( i=2;i<=num; i++) {
				if(num%i==0)
					flag=1;
					break;
			}
			
		
		if (flag==1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}

	}

}
