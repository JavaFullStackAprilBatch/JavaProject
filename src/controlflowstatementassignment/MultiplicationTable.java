//assignment 2:
//display the multiplication table of a given integer.

package controlflowstatementassignment;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int x=0;
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter an Integer number:");
        int num = scn.nextInt();

        for(int i=1;i<=10;i++){
          x =num*i ;
            System.out.println(num+ " * " + i + " = "
                    + num* i);
        }

    }
}
