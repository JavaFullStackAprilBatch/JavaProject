package pack;

import java.util.Scanner;

public class TypeCastingExample {
 public static void main(String[] args) {


     Scanner s = new Scanner(System.in);
     System.out.println("Enter Marks: ");
     String marks = s.nextLine();
     System.out.println("Enter the age");
     int age = s.nextInt();


    // String marks = "30";
    System.out.println("Marks: " + marks);
     long i = Long.parseLong(marks);


     int j = 1000;
     byte b = (byte) j;
     System.out.println(b);


 }

}
