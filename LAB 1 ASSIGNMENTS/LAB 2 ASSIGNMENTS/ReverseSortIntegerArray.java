package lab2;

import java.util.Scanner;

public class ReverseSortIntegerArray {
	
	// function to reverse a String
	public static String reverse(int num) {
		String s=""+num;
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}

	// function to sort an array after reversing its elements
	public static int[] getSorted(int[] arr) {
		String[] num=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			num[i]=""+reverse(arr[i]);
			arr[i]=Integer.parseInt(num[i]);
		}
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the size of the array : ");
		int size=sc.nextInt(); // input size for first array
		int array[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter Element "+(i+1)+" : "); // input elements of array
			array[i]=sc.nextInt();
		}
		System.out.println("The array after reversing it's elements is given below : ");
		for(int i=0;i<size;i++) {
			System.out.print(reverse(array[i])+" ");
		}
		System.out.println();
		array=getSorted(array);
		System.out.println("The sorted array is given below : ");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
		
		sc.close();
	}

}