package arraysproj;

import java.util.Scanner;
public class ArrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		AddElement a = new AddElement();
		MinMax m = new MinMax();
		RemoveDuplicate r = new RemoveDuplicate();
		
		char rep = 'y';
		while( rep == 'y') {
			System.out.print("Enter the size of the array:");
			int size = s.nextInt(), choice, ele;
			int array[]= new int[size + 5];
			System.out.print("Enter the elements:");
			for(int i=0;i < size; i++)
				array[i] = s.nextInt();
			System.out.println("Eb nter ur choice:\n 1. To find minimum and maximum elements\n 2. To append an element\n 3. to remove duplicate elements\n");
			choice = s.nextInt();
			switch(choice)
			{
				case 1: m.minmax(array, size);
						break;
				case 2: System.out.println("Enter the element to be added: ");
						ele = s.nextInt();
						a.addele(array, size,ele);
						break;
				case 3: r.remdup(array, size);
						break;
				default: System.out.println("Invalid Choice");
			}
			System.out.println("Do u want to continue???");
			rep = s.next().charAt(0);	
			
		}
		s.close();	
		
	}

}
