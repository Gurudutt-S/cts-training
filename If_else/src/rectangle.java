/*
	2. Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimeter.
*/


import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int l=sc.nextInt();
		System.out.println("enter breadth");
		int b=sc.nextInt();
		int area=l*b;
		int peremeter=2*l*b;
		System.out.println("area"+area);
		System.out.println("peremeter"+peremeter);
	}
	
	

}
