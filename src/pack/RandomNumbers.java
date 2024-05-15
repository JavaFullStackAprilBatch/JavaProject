package pack;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Random rn = new Random();

        for (int i = 1; i<= 100; i++) {
            int randamNum = rn.nextInt(10) +1;

            if(randamNum==5){
                System.out.println(randamNum);
                break;
            }else{
                System.out.println(randamNum);
            }
        }
    }

}
