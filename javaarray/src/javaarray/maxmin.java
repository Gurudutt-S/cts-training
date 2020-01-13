/*
  5. Write a program in C to find the maximum and minimum element in an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21 
 */



package javaarray;

import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
		int arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the array is:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		int large=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		System.out.println("maximum element:"+large);
		int small=arr[1];
		for(int i=0;i<size;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println("minimum element:"+small);
	}

}
