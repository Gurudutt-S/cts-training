import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		int a,b,lcm=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {
			lcm=a;
		}else {
			lcm=b;
		}
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println("lcm of "+a+ " and" +b+" : "+lcm );
				break;
			}
			++lcm;
		}

	}

}
