/*
	8. Write a Program to accept the age of the user and then, display the category of the
   user. Based on the age, the categories of the users are:
	05-12 Children
	13-19 Teenagers
	20-35 Young adults
	36-45 Mature adults
	46-55 Elders
	56 and above Seniors
*/


import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=scan.nextInt();
		if(age>0 && age<5) {
			System.out.println("small child");
		}
		else if(age>=5 && age<13) {
			System.out.println("children");
		}
		else if(age>=13 && age<20) {
			System.out.println("teenagers");
		}
		else if(age>=20 && age<36) {
			System.out.println("young adults");
		}
		else if(age>=36 && age<46) {
			System.out.println("mature adults");
		}
		else if(age>=46 && age<56) {
			System.out.println("elders");
		}
		else if(age>56 && age<=100) {
			System.out.println("seniors");
		}
		else {
			System.out.println("invalid");
		}
	}

}
