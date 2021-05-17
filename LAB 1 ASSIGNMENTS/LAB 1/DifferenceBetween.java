import java.util.Scanner;

public class DifferenceBetween {

	public static int calculateDifference(int n) {
		int i, sqsum=0, sum=0;
		for(i=1;i<=n;i++)
			sum += i;
		int sq = sum*sum;
		for(i=0;i<=n;i++)
			sqsum += i*i;
		return (sqsum - sq);
	}
	public static void main(String[] args) {
		int range;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		range = sc.nextInt();
		System.out.println("Difference between the sum of the squares of the first " + range + " natural numbers and the square of their sum is: " + calculateDifference(range));
		sc.close();
	}

}