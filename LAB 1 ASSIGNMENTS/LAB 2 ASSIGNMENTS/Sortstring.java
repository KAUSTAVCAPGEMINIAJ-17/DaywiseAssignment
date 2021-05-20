package lab2;

import java.util.Scanner;

public class Sortstring {
	
	// function to sort string array in alphabetical order and covert first half to upper case and next half to lower case
	public static String[] sortStrings(String obj[]) {
		String tmp;
		for(int i=0;i<obj.length;i++) {
			obj[i]=obj[i].toLowerCase();
		}
		for(int i=0;i<obj.length;i++) {
			for(int j=0;j<obj.length-i-1;j++) {
				if(obj[j].compareTo(obj[j+1])>0) {
					tmp=obj[j];
					obj[j]=obj[j+1];
					obj[j+1]=tmp;
				}
			}
		}
		if(obj.length%2==0) {
			for(int i=0;i<obj.length/2;i++) {
				obj[i]=obj[i].toUpperCase();
			}
			for(int i=obj.length/2;i<obj.length;i++) {
				obj[i]=obj[i].toLowerCase();
			}
		}else {
			for(int i=0;i<obj.length/2+1;i++) {
				obj[i]=obj[i].toUpperCase();
			}
			for(int i=obj.length/2+1;i<obj.length;i++) {
				obj[i]=obj[i].toLowerCase();
			}
		}
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the size of the String array : ");
		int size=sc.nextInt();
		String obj[]=new String[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter String "+(i+1)+" : ");
			obj[i]=sc.next(); // input of String objects
		}
		obj=sortStrings(obj);
		System.out.println("The sorted String array is given below : ");
		for(int i=0;i<obj.length;i++) {
			System.out.print(obj[i]+" ");
		}
		
		sc.close();
	}

}