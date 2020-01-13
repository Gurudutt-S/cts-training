/*
 	7. Write a program in C to sort elements of array in ascending order.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 7 
element - 2 : 4 
element - 3 : 5 
element - 4 : 9 
Expected Output : 
Elements of array in sorted ascending order: 
2 4 5 7 9
 */



package javaarray;

import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		int arr[],i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the elements:");
		arr=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the array is:");
		for( i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		for( i=0;i<size;i++)
		{
			for(j=i;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int large=arr[i];
					arr[i]=arr[j];
					arr[j]=large;
				}
			}
		}
		System.out.println("Elements of array in acending order:");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
