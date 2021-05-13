import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number of your Choice");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int i,sum=0;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
			System.out.println("Perfect");
		else
			System.out.println("Not Perfect");
	}

}