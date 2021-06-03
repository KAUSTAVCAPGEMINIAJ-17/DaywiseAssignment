package lab6Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Eligible_For_Voting {
	
	// method to return the ID of every person who are eligible for voting
	public static List<Integer> votersList(Map<Integer,Integer> person){
		List<Integer> list=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> m : person.entrySet()) {
			if(m.getValue()>=18) {
				list.add(m.getKey());
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total number of people : ");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Sorry Input should be more than or equal to 1..");
		else {
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<size;i++) {
				System.out.print("Enter ID of Person "+(i+1)+" : ");
				int id=sc.nextInt();
				System.out.print("Enter Age of Person "+(i+1)+" : ");
				int a=sc.nextInt();
				map.put(id, a);
			}
			List<Integer> list = votersList(map);
			System.out.println("The ID of the persons who are eligible for voting are : ");
			int k=0;
			for(int i : list) {
				System.out.println(list.get(k++));
			}
		}
		sc.close();

	}

}