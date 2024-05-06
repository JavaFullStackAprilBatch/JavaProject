package loopsproject;
import java.util.Random;

public class Randm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Random random = new Random();
				int answer = 0;
				   for (int i=0; i<=10; i++)
				   {
					answer = random.nextInt(10);
		            System.out.println(+ answer);
		            if(answer == 5)
		             	break;
		                
				   }

	}

}
