import java.util.Scanner;

public class Assignment1LeapYear {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter year ");
		int year = s.nextInt();
		s.close();
		boolean isLeapYear = false;
	  if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					isLeapYear = true;
				else
					isLeapYear = false;
			} else
				isLeapYear = true;
		} else {
			isLeapYear = false;
		}

		if (isLeapYear == true)
			System.out.println(year + " is a Leap Year.");
		else
			System.out.println(year + " is not a Leap Year.");
	}
}
