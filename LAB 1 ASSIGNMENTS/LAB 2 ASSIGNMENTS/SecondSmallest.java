package lab2;

import java.util.Scanner;

public class SecondSmallest {
	
	// function for returning second smallest element in an array
	public static int getSecondSmallest(int[] array) {
		int min=array[0], sec_min=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
			else if(array[i]<sec_min && min<array[i]) {
				sec_min=array[i];
			}
		}
		return sec_min;
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
		System.out.println("The second smallest element in the array is "+getSecondSmallest(array));
		
		sc.close();
	}

}