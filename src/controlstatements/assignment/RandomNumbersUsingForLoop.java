package controlstatements.assignment;

import java.util.Random;

public class RandomNumbersUsingForLoop {
    public static void main(String[] args) {
        int x;
        Random random = new Random();
        System.out.println("The random numbers are: ");
        for(; ;){
            x= random.nextInt(11);
            System.out.println(x);
            if(x==5){
                System.out.println("Got 5 so breaking the loop...");
                break;
            }
        }

        }
    }

