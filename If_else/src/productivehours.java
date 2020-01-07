/*
	6. Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources)
*/


import java.util.Scanner;

public class productivehours {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hours");
		int hours=sc.nextInt();
		System.out.println("Enter the resources");
		int resources=sc.nextInt();
		int productivehours=hours*resources;
		System.out.println("Productive hours="+productivehours);
	}
}
