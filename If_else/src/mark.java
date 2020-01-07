/*
	5. Consider a scenario where all candidates have to take two tests before appearing for an
   interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest.
*/


import java.util.Scanner;

public class mark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int average;
		System.out.println("Enter mark of first exam");
		int mark1=sc.nextInt();
		System.out.println("Enter mark of second exam");
		int mark2=sc.nextInt();
		if(mark1>=75) {
			if(mark2>0) {
				average=(mark1+mark2)/2;
				System.out.println("average="+average);
				if(average>=80) {
					System.out.println("You are selected");
				}
				else {
					System.out.println("You are rejected");
				}
			}
		}
		else {
		
			System.out.println("You are rejected");
		}
	}

}
