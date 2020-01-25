import java.util.Scanner;

public class SumOfNaturalNos {

	public static void main(String[] args) {
		int lower,upper,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lower limit");
		lower=sc.nextInt();
		System.out.println("enter upper limit");
		upper=sc.nextInt();
		
		for(int i=lower;i<=upper;i++) {
			 sum=sum+i;
		}
		System.out.println("sum: "+sum);
	}

}
