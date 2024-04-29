package loops.typecasting.assignments;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        for (int i = 4; i <= year; i += 4) {
            if ((i % 100 != 0) || (i % 400 == 0)) {
                if (i == year) {
                    isLeapYear = true;
                    break;
                }
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();

	}

}
