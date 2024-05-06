package controlstatements.assignment;

import java.util.Random;

public class RandomNumbersUsingWhileLoop {
    public static void main(String[] args) {
        int x;
        int i = 0;

        Random random = new Random();
        while ( true) {
            x = random.nextInt(11);
            System.out.println(x);
            i++;
            if (x == 5) {
                System.out.println("Got 5 so breaking the loop...");
                break;
            }

        }
    }
}
