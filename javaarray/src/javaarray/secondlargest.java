/*
 	8. Write a program in C to find the second largest element in an array.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is : 6
 */


package javaarray;

import java.util.Scanner;

public class secondlargest {

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
		int large2=0;
		for(int i=1;i<size;i++)
		{
		    if(large<arr[i])
		    {
		        large2=large;
		        large=arr[i];
		    }
		    else if(large<arr[i] && arr[i]!=large)
		    {
		        large2=arr[i];
		    }
		}
		System.out.println("2nd maximum element:"+large2);

	}

}
