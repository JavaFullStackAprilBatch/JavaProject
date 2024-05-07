package loopproj;

public class Alphabet
{
	public void alpha() {
		System.out.println("ALPHABETS using FOR loop");
		for(char ch = 'A'; ch <= 'Z'; ch++) 
			System.out.print(ch );
		char ch = 'a';
		System.out.println("\nALPHABETS using WHILE loop");
		while(ch <= 'z')
			System.out.print(ch++);
			
	}

}
