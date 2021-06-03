package lab6Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MedalType {
	
	// method to return medal type secured by student as per the marks
	
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> h){
		HashMap<Integer,String> output = new HashMap<>();
		for(Map.Entry<Integer,Integer> m : h.entrySet()) {
			if(m.getValue()>=90)
			{
				output.put(m.getKey(),"Gold");
			}
			else if(m.getValue()>=80 && m.getValue()<90)
			{
				output.put(m.getKey(),"Silver");
			}
			else if(m.getValue()>=70 && m.getValue()<80)
			{
				output.put(m.getKey(),"Bronze");
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total number of students there in a class : ");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Sorry Input should be more than or equal to 1..");
		else {
			HashMap<Integer,Integer> h=new HashMap<>();
			for(int i=0;i<size;i++) {
				System.out.print("Enter the University Registration number of Student "+(i+1)+" : ");
				int RegNo=sc.nextInt();
				System.out.print("Enter the Marks of the Particular Student (out of 100)  "+(i+1)+" : ");
				int marks=sc.nextInt();
				h.put(RegNo,marks);
			}
			HashMap<Integer,String> output=getStudents(h);
			System.out.print("\nThe Student Registration Number along with the Medal Type Acheieved is given below :\n");
			for(HashMap.Entry<Integer,String> hp : output.entrySet()) {
				System.out.println("University Registration Number : "+hp.getKey()+", Medal Type : "+hp.getValue());
			}
		}
		sc.close();
	}

}