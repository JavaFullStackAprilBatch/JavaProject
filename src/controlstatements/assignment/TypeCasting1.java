package controlstatements.assignment;

import java.util.Scanner;

public class TypeCasting1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scanner.nextInt();
        byte b = (byte) n;
        short c = (short) n;
        long l = (long) n;
        float f = (float) n;
        double d = (double) n;
        System.out.println("Byte value : " + b);
        System.out.println("Short value : " + c);
        System.out.println("Long value : " + l);
        System.out.println("Float value : " + f);
        System.out.println("Double value : " + d);
        scanner.close();
    }
}
