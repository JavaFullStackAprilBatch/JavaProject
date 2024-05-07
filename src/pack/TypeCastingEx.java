package pack;

import java.util.Scanner;

public class TypeCastingEx {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the age:");
        String age = s.nextLine();
          int i = Integer.parseInt(age);

          int j = 2000;
          byte b  = (byte) j;
            System.out.println(b);
    }
}

