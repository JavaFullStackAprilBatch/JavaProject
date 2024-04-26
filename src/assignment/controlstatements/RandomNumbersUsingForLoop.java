package assignment.controlstatements;

import java.util.Random;

public class RandomNumbersUsingForLoop {
    public static void main(String[] args) {
        int x;
        Random random = new Random();
        for(int i=0;i<10;i++){
            x= random.nextInt(9)+2;
            System.out.println(x);
            if(x==5){
                System.out.println("Got 5 so breaking the loop...");
                break;
            }
        }

        }
    }

