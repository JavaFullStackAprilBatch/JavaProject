package typecasting;
import java.util.Scanner;

public class ExplicitConv {
	public void expConv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println(num);
		byte b = (byte) num;
		short st = (short) num;
		char ch = (char) num;
		
		System.out.println("Narrowing COnversion from int " + num + " to\n " + b + "byte\n" + st + "short\n" + ch + " Character");
		sc.close();
	}
	

}
