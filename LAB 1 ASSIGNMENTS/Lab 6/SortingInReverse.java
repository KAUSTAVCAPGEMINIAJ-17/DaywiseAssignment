package lab6Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingInReverse {
	
	public static int reverse(int num) {
		String string=""+num;
		String reverse="";
		for(int i=string.length()-1;i>=0;i--) {
			reverse+=string.charAt(i);
		}
		return Integer.parseInt(reverse);
	}
	
	// method to reverse each elements of an array and sort and return the reversed array
	
	public static int[] getSorted(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			array[i]=reverse(array[i]);
			arrayList.add(array[i]);
		}
		Collections.sort(arrayList);
		for(int i=0;i<array.length;i++) {
			array[i]=arrayList.get(i);
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Sorry-the Size of the Array you have given should be more than equal to 1");
		else {
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element No "+(i+1)+" : ");
				array[i]=sc.nextInt();
			}
			System.out.println("The reversed elements before sorting the array : ");
			for(int i=0;i<size;i++) {
				System.out.print(reverse(array[i])+" ");
			}
			System.out.println();
			System.out.println("The reversed elements after sorting the array : ");
			array=getSorted(array);
			for(int i=0;i<size;i++) {
				System.out.print(array[i]+" ");
			}
		}
		
		sc.close();
	}

}