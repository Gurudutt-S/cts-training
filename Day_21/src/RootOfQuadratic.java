import java.util.Scanner;
import java.lang.Math;

public class RootOfQuadratic {

	public static void main(String[] args) {
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a,b,c:");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		double sum=Math.sqrt(b*b-4*a*c);
		double total=(-b+sum)/2*a;
		double total1=(-b-sum)/2*a;
		System.out.println("The roots of Quadratic equation:  "+total+" , "+total1);
	}

}
