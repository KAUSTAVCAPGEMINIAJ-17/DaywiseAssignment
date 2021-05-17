package daywiseassignemt4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOccurence {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int max=0,count=0;
		char ch;
		char[] chArr=new char[1];
		chArr[0]=arr[0];
		int k=2;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<chArr.length;j++)
			{
				if((arr[i]!=chArr[j])&&(arr[i]!=' '))
				{
					count++;
				}
			}
			if(count==chArr.length)
			{
				chArr=Arrays.copyOf(chArr,k);
				chArr[k-1]=arr[i];
				k++;
			}
			
		}
		int[] arrCount=new int[chArr.length];
		for(int i=0;i<chArr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==chArr[i])
				{
					count++;
				}
			}
			arrCount[i]=count;
		}
		for(int j=0;j<chArr.length;j++)
		{
			if(arrCount[j]>max)
			{
				max=arrCount[j];
			}
		}
		
		System.out.print("Character with maximum occurrence : ");
		for(int j=0;j<chArr.length;j++)
		{
			if(max==arrCount[j])
			{
				System.out.print(chArr[j]+" ");
			}
		}
		System.out.println();
		System.out.print("Number of occurrence : "+max);
	}

}