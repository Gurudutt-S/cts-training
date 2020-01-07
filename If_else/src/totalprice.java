/*
	3. You have to write a Program that accepts the product name and quantity as input
   and displays the total price using the unit prices already stored in the system
*/


import java.util.Scanner;

public class totalprice {
	public static void main(String[] args) {
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("The Products available:\n apple \n orange \n banana \n onion");
		System.out.println("Enter the product");
		String product=sc.nextLine();
		System.out.println("Enter the quanity");
		int quantity=sc.nextInt();
		if(product.equals("apple")) {
			total=quantity*50;
			System.out.println("Price"+total);
		}
		else if(product.equals("orange")) {
			total=30*quantity;
			System.out.println("Price"+total);
		}
		else if(product.equals("banana")) {
			total=70*quantity;
			System.out.println("Price"+total);
		}
		else if(product.equals("onion")) {
			total=140*quantity;
			System.out.println("Price"+total);
		}
	}
}
