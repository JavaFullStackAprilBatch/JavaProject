package arrays.assignment;

public class MinMaxValueInArray {
    public static void main(String[] args) {
        int a[] = {3, -1, 51, 5, 2, 7, 65, 72, 56};
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Minimum value in an array =" + min);
        System.out.println("Maximum value in an array =" + max);
    }

}


