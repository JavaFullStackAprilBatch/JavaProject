package collectionframework.assignment;

import java.util.HashSet;


public class NumberOfUniqueElementsInAnArray {
    public static void main(String[] args) {
        try {
            int[] arr = {15, 16, 17, 27, 27, 28};
            HashSet<Integer> hset = new HashSet<>();
            for (int element : arr) {
                hset.add(element);

            }
            System.out.println(hset);
            System.out.println("Number of unique elements in an array : " +hset.size());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getStackTrace();
        }
    }
}





