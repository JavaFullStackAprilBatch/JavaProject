package controlstatements.assignment;

public class PrintTheAlphabets {
    public static void main(String[] args) {
        char C;
        for (C = 'A'; C <= 'Z'; C++) {

            System.out.print(C + " ");

        }
        System.out.println(" ");
        char c = 'a';
        while (c <= 'z') {
            System.out.print(c + " ");
            c++;
        }
    }
}
