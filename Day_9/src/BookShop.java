import java.util.Scanner;

public class BookShop {

	public static void main(String[] args) {
		
		String [] course;
		String choice;
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("The available Courses:\n 1.Java : \t5000  \n 2.C :\t3000 \n 3.C++ : \t2000 \n 4.Python : \t10000 \n 5.Angular : \t20000");
		
		System.out.println("Enter the courses:\n");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextLine();
		
		StringBuffer sb=new StringBuffer();
		
		if(choice.contains("java"))
		{
			sb.append("java    5000");
			System.out.println("java:\t 5000");
			count=count+5000;
		}
		if(choice.contains("c"))
		{
			sb.append("c    3000");
			System.out.println("c:\t 3000");
			count=count+3000;
		}
		if(choice.contains("c++"))
		{
			sb.append("c++    2000");
			System.out.println("c++:\t 2000");
			count=count+2000;
		}
		if(choice.contains("python"))
		{
			sb.append("python    10000");
			System.out.println("python:\t 10000");
			count=count+10000;
		}
		if(choice.contains("angular"))
		{
			sb.append("angular    10000");
			System.out.println("angular:\t 20000");
			count=count+20000;
		}
		
		System.out.println("Total price: "+count);
	}

}

