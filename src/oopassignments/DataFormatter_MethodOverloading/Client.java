package oopassignments.DataFormatter_MethodOverloading;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		
		Date currentDate = new Date();
        DateFormatter df = new DateFormatter();

        // Test different overloaded methods to format the date
        System.out.println("Formatted Date (MM/dd/yyyy): " + df.formatDate(currentDate));
        System.out.println("Formatted Date (dd/MM/yyyy): " + df.formatDate(currentDate, true));
        System.out.println("Formatted Date (yyyy-MM-dd): " + df.formatDate(2024, 5, 4));

	}

}
