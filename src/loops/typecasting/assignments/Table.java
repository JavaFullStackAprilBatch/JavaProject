package loops.typecasting.assignments;
import java.util.*;

public class Table {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();

	}

}