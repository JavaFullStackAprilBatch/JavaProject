package typecasting;
import java.util.Scanner;

public class IntToString {
	public void strconv() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		Integer number = s.nextInt();
	
		String str = number.toString();
		
		System.out.println("Integer to String: " + str);
		s.close();
	}
}
