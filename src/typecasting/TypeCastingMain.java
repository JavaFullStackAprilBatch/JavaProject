package typecasting;
import java.util.Scanner;
public class TypeCastingMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		IntToString i = new IntToString();
		ExplicitConv e = new ExplicitConv();
		System.out.println("Enter ur choice:");
		int choice = s.nextInt();
		if(choice == 1)
			i.strconv();
		else if (choice == 2)
			e.expConv();
		else 
			System.out.println("INvalid choice");
		s.close();

	}

}
