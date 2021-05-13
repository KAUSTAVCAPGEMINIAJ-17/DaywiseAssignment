import java.util.Scanner;

public class IncreasingNumber {
	
	public static boolean checkNumber(int number) {
		boolean flag = true;
	    int currentDigit = number % 10;
	    number = number /10;
	    while(number > 0) {
	    	if(currentDigit <= number % 10){
	    		flag = false;
	            break;
	    	}
	    	currentDigit = number % 10;
	        number = number / 10;
	    }
	    return flag;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	    num = sc.nextInt();
	    if(checkNumber(num))
	    	System.out.println(num + "is an increasing number.");
	    else
	    	System.out.println(num + "is not an increasing number.");
	    sc.close();
	}

}