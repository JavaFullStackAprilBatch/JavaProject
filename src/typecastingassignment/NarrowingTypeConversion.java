/*Assignment 2:Take an input as int type variable from the
user using the Scanner class and then perform the
narrowing or explicit type conversion and Print the value
fo each data type.*/

package typecastingassignment;

import java.util.Scanner;

public class NarrowingTypeConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer value:");
        int n = scn.nextInt();
        byte b = (byte)n;
        System.out.println("converting int to byte:"+ b);
        short s = (short)n;
        System.out.println("converting int to short:" + s);
        char c = (char)n;
        System.out.println("converting int to char:" + c);
    }
}
