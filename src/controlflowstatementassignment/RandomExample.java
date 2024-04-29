
//Assignment 4:print random numbers between 1 and 10 until you come across the number 5


        package controlflowstatementassignment;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {


        Random random = new Random();
        int rand = 0;
        while (true) {
            rand = random.nextInt(11);
            if(rand!=5 && rand != 0) break;
        }
        System.out.println(rand);
    }
}
