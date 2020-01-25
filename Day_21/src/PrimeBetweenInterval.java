import java.util.Scanner;

public class PrimeBetweenInterval {

	public static void main(String[] args) {
		int lower,upper,i,j;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lowe limit: ");
		lower=sc.nextInt();
		System.out.println("enter upper limit: ");
		upper=sc.nextInt();
		for( i=lower;i<upper;i++) {
			flag=false;
		
			for( j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=true;
					break;
					
				}
			}
			if(!flag) {
				System.out.println(i);
			}
		
		}

	}

}
