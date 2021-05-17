package LAB3;

import java.util.Scanner;

public class PositiveString {
	
	public static boolean isPositiveString(String s)
	{
		String temp=s.toLowerCase();
		int flag=0;
		for(int i=0;i<temp.length()-1;i++) {
			if(temp.charAt(i)>temp.charAt(i+1)) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the string : ");
		String input = sc.next(); // input for string
		if(isPositiveString(input))
			System.out.println(input+" is a positive string");
		else
			System.out.println(input+" is not a positive string");

		sc.close();
	}

}