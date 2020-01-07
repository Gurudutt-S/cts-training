/*
	1. Write a Program that accepts a number and checks whether it's positive, negative, or
   zero.
*/


import java.util.Scanner;
public class positivenegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number to be checked");
		n=sc.nextInt();
		if(n==0) {
			System.out.println("The number is 0");
		}
		else if(n<0){
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is positive");
		}
	}

}
