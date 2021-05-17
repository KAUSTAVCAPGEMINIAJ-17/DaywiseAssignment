package LAB3;

import java.util.*;
import java.text.*;
import java.time.*;

public class DateTimeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		System.out.print("Enter the date in dd-MM-yyyy format : ");
		String dt_input=sc.next(); // input for date
		try {
			Date date=new Date();
			Date date_input = sdf.parse(dt_input);
			ZoneId zd=ZoneId.systemDefault();
			Instant ins1=date.toInstant();
			Instant ins2=date_input.toInstant();
			LocalDate ld1=ins1.atZone(zd).toLocalDate();
			LocalDate ld2=ins2.atZone(zd).toLocalDate();
			Period prd=Period.between(ld1, ld2);
			System.out.println("Current Date : "+sdf.format(date));
			System.out.println("Entered Date : "+sdf.format(date_input));
			System.out.println("Duration is "+Math.abs(prd.getDays())+" days "+Math.abs(prd.getMonths())+" months and "+Math.abs(prd.getYears())+" years.");
		}
		catch(Exception e) {
			System.out.println("Either Date is not in correct format or Date does not exist.");
		}
		
		sc.close();
	}

}