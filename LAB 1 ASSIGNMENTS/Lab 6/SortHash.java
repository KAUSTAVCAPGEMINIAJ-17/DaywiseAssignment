package lab6Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortHash {
	
	// method to sort a HashMap with respect to it's value
	public static List getValues(HashMap<Character,Integer> hm){
		
		List<Map.Entry<Character, Integer>> lst = new ArrayList<>(hm.entrySet());
		
		Collections.sort(lst, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> m1, Map.Entry<Character, Integer> m2) {
				return m1.getValue()-m2.getValue();
			}
		});
		
		return lst;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		char ch=' ';
		HashMap<Character,Integer> h=new HashMap<>();
		System.out.print("Enter the size of your Hash Map : ");
		char c;
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Sorry Input should be more than or equal to 1..");
		else {
			for(int i=0;i<size;i++) {
				System.out.printf("Enter Key %d : ",(i+1));
				c=sc.next().charAt(0);
				h.put(c, (int)c);
			}
			List<Map.Entry<Character, Integer>> list = getValues(h);
			System.out.println();
			System.out.print("1. Ascending Sort\n2. Descending Sort\n\nEnter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1: System.out.print("\nThe characters and their corresponding ascii value in ascending order is given below :\n");
					for(int i=0;i<list.size();i++) {
						Map.Entry<Character, Integer> m = list.get(i);
						System.out.println((i+1)+". "+m.getKey()+" - Ascii Value -> "+m.getValue());
					}
					break;
			case 2: System.out.print("\nThe characters and their corresponding ascii value in descending order is given below :\n");
					for(int i=list.size()-1;i>=0;i--) {
						Map.Entry<Character, Integer> m = list.get(i);
						System.out.println((list.size()-i)+". "+m.getKey()+" - Ascii Value -> "+m.getValue());
					}
					break;
			default: System.out.println("Invalid Choice \nPlease Enter Choice Between 1 or 2 Next Time");
			
			}
		}
		
		sc.close();
	}

}