
import java.util.Scanner;

public class SumOfCubes {
	
	public static int cubesOfdigits(int number) {
		int sum = 0, rem;
		while(number > 0) {
			rem = number % 10;
			sum = sum + (rem*rem*rem);
			number = number / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of your choice ");
		num = sc.nextInt();
		System.out.println("Sum of the cubes of the digit " + num + " is: " + cubesOfdigits(num));
		sc.close();
	}

}