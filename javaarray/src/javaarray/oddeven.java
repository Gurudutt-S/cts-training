/*
 	6. Write a program in C to separate odd and even integers in separate arrays.
Test Data : 
Input the number of elements to be stored in the array :5 
Input 5 elements in the array : 
element - 0 : 25 
element - 1 : 47 
element - 2 : 42 
element - 3 : 56 
element - 4 : 32 
Expected Output : 
The Even elements are : 
42 56 32 
The Odd elements are : 
25 47
 */


package javaarray;

import java.util.Scanner;

public class oddeven {

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
		System.out.println("the even elements are:");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("the odd elements are:");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
