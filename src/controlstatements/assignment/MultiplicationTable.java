package controlstatements.assignment;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println("The Multiplication Table of " + n + " is :");
        for (int i = 1; i <= 10; i++) {
            int a = n * i;
            System.out.println(+n + " * " + i + " = " + a);
        }
        System.out.println(" ");
        int i=1;
        while(i<=10){
            int a = n * i;
            System.out.println(+n + " * " + i + " = " + a);
            i++;
        }
        scanner.close();
    }
}
