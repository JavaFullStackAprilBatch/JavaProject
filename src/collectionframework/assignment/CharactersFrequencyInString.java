package collectionframework.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharactersFrequencyInString {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String : ");
            String str = sc.nextLine();
            str = str.toLowerCase();
            System.out.println(str);
            char[] c = str.toCharArray();
            Map<Character, Integer> charCount = new HashMap<>();
            for (char ch : c) {
                if (charCount.containsKey(ch)) {
                    charCount.put(ch, charCount.get(ch) + 1);
                } else {
                    charCount.put(ch, 1);
                }


            }
            for (Map.Entry entry : charCount.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

