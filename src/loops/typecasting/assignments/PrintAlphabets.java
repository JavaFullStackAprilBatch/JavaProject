package loops.typecasting.assignments;

public class PrintAlphabets {

	public static void main(String[] args) {
		
        System.out.println("Lowercase alphabets:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("Uppercase alphabets:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
	}
}
