package loops.typecasting.assignments;
import java.util.*;

public class TypeCasting {

	public static void main(String[] args) {
		
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int i = scanner.nextInt();

	        String strNumber = "" + i;
	        System.out.println("Converted String: " + strNumber);

	        scanner.close();
	}
}
