package pack;

public class Usman_Arrays_Assignment1 {


    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 5, 1, 4, 8, 6};
        int maxValue = findMaxValue(array);
        int minValue = findMinValue(array);
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
    }

    public static int findMaxValue(int[] arr) {
        if (arr.length == 0) { 
            System.out.println("Array is empty");
        }

        int maxVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
    
    public static int findMinValue(int[] arr) {
       
        if (arr.length == 0) {
        	System.out.println("Array is empty");
        }

        int minVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        return minVal;
    }
}
