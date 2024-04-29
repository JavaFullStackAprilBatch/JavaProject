
//Assignment 4:print random numbers between 1 and 10 until you come across the number 5


        package controlflowstatementassignment;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {


        Random random = new Random();


        int rand = 0;
        while (true) {          //using while loop
            rand = random.nextInt(10);

            if (rand != 5) {

                System.out.println(rand);
            } else if (rand == 5) {
                break;
            }
        }

        for(int i=0;i>-1;i++){   //using for loop
            rand = random.nextInt(10);
            if(rand!=5) {
                System.out.println(rand);
            }
            else if(rand ==5) {
                break;
            }



            }

    }
}

