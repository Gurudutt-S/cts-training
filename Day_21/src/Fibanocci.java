import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		int num,c;
		System.out.println("enter the limit");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<num;i++) {
			 c=a+b;
			 System.out.println(c);
			 a=b;
			 b=c;
		}

	}

}
