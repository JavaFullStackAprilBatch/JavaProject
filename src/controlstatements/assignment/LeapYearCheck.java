package controlstatements.assignment;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int n = scanner.nextInt();
        if (n % 4 == 0) {
            if (n % 100 != 0 || n % 400 == 0) {
                System.out.println("It is a leap year");
            }
        }

            else {
                System.out.println("Not a leap year");
            }
            scanner.close();

        }
    }


