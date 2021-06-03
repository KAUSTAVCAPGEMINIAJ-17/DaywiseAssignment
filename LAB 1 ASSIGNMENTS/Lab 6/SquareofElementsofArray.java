package lab6Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SquareofElementsofArray {
	
	// method to generate squares of elements of an array
	public static Map<Integer,Integer>Square(int[] array){
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<array.length;i++) {
			map.put(array[i], array[i]*array[i]);
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		System.out.print("Enter the size of the array for which you want the Square : ");
		int size=sm.nextInt();
		if(size<1)
			System.out.println("Sorry-the Size of the Array you have given should be more than equal to 1");
		else {
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element No."+(i+1)+" : ");
				array[i]=sm.nextInt();
			}
			Map<Integer,Integer> map=Square(array);
			System.out.print("The Numbers along with their squares are been Printed below :\n");
			for(Map.Entry<Integer, Integer> m : map.entrySet()) {
				System.out.println("Your Number in array : "+m.getKey()+",Therefore Square of "+m.getKey()+" : "+m.getValue());
			}
		}
		sm.close();

	}

}