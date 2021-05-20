import java.util.Scanner;
public class ArrayCheck {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter 10 Numbers::");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		System.out.println("Continue statement Part");
		for(int i=0;i<10;i++)
		{
			if(arr[i]==0)
			{
				System.out.println(arr[i]);
				continue;
			}
		}
		System.out.println("Break statement Part");
		for(int i=0;i<10;i++)
		{
			if(arr[i]==0)
				break;
		}
	}
}