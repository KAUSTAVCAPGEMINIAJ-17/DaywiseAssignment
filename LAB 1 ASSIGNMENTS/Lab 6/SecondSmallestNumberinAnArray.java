package lab6Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallestNumberinAnArray {
	
	// method to return second smallest element in an array
	public static int getScndsmlst(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			arrayList.add(array[i]);
		}
		Collections.sort(arrayList);
		int secondSmallest=arrayList.get(1);
		for(int i=1;i<array.length;i++) {
			if(arrayList.get(i)!=arrayList.get(i-1))
			{
				secondSmallest=arrayList.get(i);
				break;
			}
		}
		return secondSmallest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Sorry Invalid Input");
		else {
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element No."+(i+1)+" : ");
				array[i]=sc.nextInt();
			}
			System.out.println("The second smallest number in the array is : "+getScndsmlst(array)+".");
		}
		sc.close();
	}

}