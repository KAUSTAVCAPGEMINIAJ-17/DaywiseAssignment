package lab6Assignments;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class FrequencyOFCharectar {
	
	// method to count frequency of a character in an array
	public static int count(char[] arr,char k) {
		int freqcounter=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k)
				freqcounter++;
		}
		return freqcounter;
	}
	
	public static Map<Character,Integer> countChars(char[] arr){
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					map.put(arr[i],count(arr, arr[i]));
				}
			}
			map.put(arr[arr.length-1],count(arr,arr[arr.length-1]));
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the character array : ");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Sorry Input should be more than or equal to 1...");
		else {
		char arr[]=new char[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter Character No."+(i+1)+" : ");
			arr[i]=sc.next().charAt(0);
		}
		Map<Character,Integer> map=countChars(arr);
		System.out.println("The total number of times each character appears in the array is : ");
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println("Character : "+m.getKey()+", Frequency : "+m.getValue());
		}
		}
		sc.close();

	}

}