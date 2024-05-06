package loopsproject;
import java.util.Random;

public class Randm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand = 0;
		Random random = new Random();
           while (true) {
        	   rand = random.nextInt(10);
        	   System.out.println(+ rand);
        	   if(rand==5)
        		   break;		        	   
		}
}
// TODO Auto-generated method stub
}


