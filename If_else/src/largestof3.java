/*
	7. Write a Program to accept three numbers and to display the largest of the three numbers.
*/


import java.util.Scanner;

public class largestof3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is larger");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is larger");
		}
		else {
			System.out.println(c+"is larger");
		}
	}
}
