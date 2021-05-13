
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=145,sum=0,d,temp=num,fact;
		while(num>0)
		{
			 d=num%10;
			 fact=1;
			 for(int i=1;i<=d;i++)
			 {
				 fact=fact*i;
			 }
			 sum=sum+fact;
			 num=num/10;
			}
		if(sum==temp)
			System.out.println("IT IS A STRONG NUMBER");
		else
			System.out.println("IT IS NOT A STRONG NUMBER");

	}

}