import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		boolean leap=true;		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year:");
		year=sc.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}else {
					leap=false;
				}
			}else {
			leap=true;
			}
		}else {
			leap=false;
		}
		
		if(leap==true) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}
		
	}

}
