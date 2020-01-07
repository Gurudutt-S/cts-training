/*
	4. Consider an example, where the discount percentage on a TV needs to be decided
   on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
   selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
   the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
   screen, the discount is 10% of the SP.
*/


import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prodcut");
		String product=sc.nextLine();
		if(product.equals("crt")) {
			int crtprice=10000;
			int percentage=crtprice*5/100;
			int total=crtprice-percentage;
			System.out.println("Price of crt ="+crtprice);
			System.out.println("Price of crt after discound="+total);
		}
		else if(product.equals("lcd")) {
			System.out.println("Enter the screen size(14/21 inches)");
			int screensize=sc.nextInt();
			if(screensize==14) {
				int lcd14price=20000;
				int percentage=lcd14price*8/100;
				int total=lcd14price-percentage;
				System.out.println("Price of crt ="+lcd14price);
				System.out.println("Price of crt after discound="+total);
			}
			else if(screensize==21) {
				int lcd21price=40000;
				int percentage=lcd21price*10/100;
				int total=lcd21price-percentage;
				System.out.println("Price of crt ="+lcd21price);
				System.out.println("Price of crt after discound="+total);
			}
		}
	}
}
