/*
Assignment 1:Take an input as int type variable from the user using the
Scanner class and then convert the integer to String. (use the method exists in the
String class to convert from int to String)
*/

package typecastingassignment;

import java.util.Scanner;

public class ConvertIntToString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int n =scn.nextInt();
        String str = Integer.toString(n);
        System.out.println("converting input integer to string :"+ str);
    }
}
