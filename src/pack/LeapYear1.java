package pack;

import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 2024;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not a Leap Year");
    }
}
