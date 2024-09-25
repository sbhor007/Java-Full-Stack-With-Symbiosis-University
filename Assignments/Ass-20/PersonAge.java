package Assignment20;

/*
 * Accept Person Date Of Birth and Find out Current Age
 */

import java.util.*;
import java.time.LocalDate;
import java.time.Period;

public class PersonAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter A Date of Birth (YYYY-MM-DD) : ");
			String dateOfBirth = scan.next();

			LocalDate DOB = LocalDate.parse(dateOfBirth);
			LocalDate currentDate = LocalDate.now();

			Period age = Period.between(DOB, currentDate);
			System.out.println("Your Current age is : " + age.getYears() + " Years " + age.getMonths() + " Month "
					+ age.getDays() + " Days ");
		} catch (Exception e) {
			System.out.println("Invalid Date...");
		}
	}

}
