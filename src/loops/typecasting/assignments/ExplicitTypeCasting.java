package loops.typecasting.assignments;
import java.util.*;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = scanner.nextInt();

        byte byteValue = (byte) i;
        short shortValue = (short) i;
        char charValue = (char) i;

        System.out.println("Value as byte: " + byteValue);
        System.out.println("Value as short: " + shortValue);
        System.out.println("Value as char: " + charValue);
        scanner.close();
	}
}