package pack;
import java.util.Arrays;

public class Usman_Arrays_Assignment3 {

	public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        Arrays.sort(array);

        int uniqueCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueCount++;
            }
        }
        int[] uniqueArray = new int[uniqueCount];
        uniqueArray[0] = array[0];

        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueArray[index++] = array[i];
            }
        }
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

}
