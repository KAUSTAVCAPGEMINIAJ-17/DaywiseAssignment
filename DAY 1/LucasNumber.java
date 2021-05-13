public class LucasNumber {
	public static void main(String args[])
	{
		int a=2;
		int b=1;
		int c=3;
		System.out.println("First 10 numbers of the Lucas Sequence::");
		System.out.println(a);
		System.out.println(b);
		int p;
		while(c<=10)
		{
			p=a+b;
			System.out.println(p);
			a=b;
			b=p;
			c++;
		}
	}
}
