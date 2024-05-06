
//Assignment 1:
//  Check whether a year is Leap Year or not.

package controlflowstatementassignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = scn.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("this year is Leapyear");
                } else {
                    System.out.println("Year not leapyear");
                }
            }
            else if (year%100!=0) {
                  System.out.println("Year is leapyear");
            }

        }

            else if (year%4!=0){
                System.out.println("not a leapyear");
            }
    }

}
