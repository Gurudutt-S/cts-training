import java.util.Scanner;

public class positiveNegative {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println("number is zero");
		}else if(num>0){
			System.out.println("number is positive");
		}else {
			System.out.println("number is negative");
		}

	}

}
