package javaarray;

import java.util.Scanner;

public class copy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],arr2[],i;
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		arr=new int[size];
		arr2=new int[size];
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
		for(i=0;i<size;i++)
		{
			arr2[i]=arr[i];
		}
		System.out.println("second array:");
		for(i=0;i<size;i++)
		{
			System.out.println(arr2[i]);
		}
	}

}
