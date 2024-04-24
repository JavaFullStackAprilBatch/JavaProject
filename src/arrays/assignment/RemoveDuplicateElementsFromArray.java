package arrays.assignment;

public class RemoveDuplicateElementsFromArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int b[] = new int[5];
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[i]) {
                b[j] = a[i - 1];
                j++;
            }
        }
        b[j++] = a[a.length - 1];

        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] + " ");

        }
    }


}




