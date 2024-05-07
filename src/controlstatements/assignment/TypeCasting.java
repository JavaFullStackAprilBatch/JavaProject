package controlstatements.assignment;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        String s = Integer.toString(n);
        System.out.println("String value : " + s);
        scanner.close();


    }
}
