package pack;

public class Usman_Arrays_Assihnment2 {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] newArray = new int[array.length + 1];
		
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = 50;
        System.out.println("Array after adding new element 50: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }

	}

}
