package loops.typecasting.assignments;
import java.util.*;

public class RandomNumbers {

	public static void main(String[] args) {
		
        Random random = new Random();
        int randomNumber;
        
        //using for loop
        System.out.println("Using For loop");
        for (int i = 1; ; i++) {
            randomNumber = random.nextInt(10) + 1;
            System.out.println(i + ": " + randomNumber);
            if (randomNumber == 5) {
                break;
            }
        }
        
        //using while loop
        System.out.println("Using While loop");
        int i = 1;
        while (true) {
            randomNumber = random.nextInt(10) + 1;
            System.out.println(i + ": " + randomNumber);
            if (randomNumber == 5) {
                break;
            }
            i++;
        }
	}
}
