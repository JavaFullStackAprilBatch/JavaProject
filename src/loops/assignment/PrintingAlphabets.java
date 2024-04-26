package loops.assignment;

public class PrintingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		for (ch ='A';ch<= 'Z';ch++) {
			System.out.print(ch +" ");
		}
		System.out.println();
		ch = 'a';
		while( ch <= 'z') {
			System.out.print(ch +" ");
			ch++;
		}
	}

}
