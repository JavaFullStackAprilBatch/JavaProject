package com.collectionassignment;

import java.security.Key;
import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        String word = "Welcome";

     java.util.Map<Character,Integer> freqmap=countCharacterFrequency(word);
     for(java.util.Map.Entry<Character,Integer> entry :freqmap.entrySet())
     {
         System.out.println(entry.getKey() +"  "+entry.getValue());
     }

    }

    private static java.util.Map<Character, Integer> countCharacterFrequency(String word) {
        word=word.toLowerCase();

        java.util.Map<Character,Integer> map=new HashMap<>();

        for(char c : word.toCharArray())
        {
            try{
                if(Character.isLetter(c))
                {
                    map.put(c,map.getOrDefault(c,0)+1);

                }
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

        return map;
    }
}
