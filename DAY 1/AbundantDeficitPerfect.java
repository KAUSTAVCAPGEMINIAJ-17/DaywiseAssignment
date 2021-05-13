
public class AbundantDeficitPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<10000;i++)
		{
			if(i==1)
				System.out.println("1 is neither perfect nor abundant nor deficit");
			else
			{
				int sum=0;
				for(int j=1;j<=(i/2);j++)
				{
				if(i%j==0)
				sum+=j;
				}
				if(sum==i)
				System.out.println(i+" is a Perfect number \n");
				else if(sum<i)
				System.out.println(i+" is a Deficient number \n");
				else
				System.out.println(i+" is an Abundant number \n");
			}
			
		}
	}

}