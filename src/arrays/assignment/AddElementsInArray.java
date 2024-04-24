package arrays.assignment;

public class AddElementsInArray {
    public static void main(String[] args) {
        int a[] = new int[11];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = i + 1;

        }
        a[a.length - 1] = 50;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
