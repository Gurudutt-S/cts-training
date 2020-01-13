package javaarray;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],i;
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter the numbers");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array :");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("array in reverse:");
		for(i=size-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
