package javaarray;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],arr2[],i,j;
		int count=0;
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
		System.out.println("Dupicate elements4");
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
		
		

	}

}
