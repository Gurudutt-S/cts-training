import java.util.Scanner;

public class VovelsConsonts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the letter: ");
		String letter=sc.nextLine();
		if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
			System.out.println("Vovel: "+letter);
		}
		else
		{
			System.out.println("Consonent: "+letter);
		}

	}

}
