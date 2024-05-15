package com.bhuvama.workspace.Collections;

import java.util.Arrays;
import java.util.HashSet;

public class hashsetotarray {
    public static void main(String[] args) {
        HashSet set= new HashSet<>();
        set.addAll(Arrays.asList("blue","white","yello", "green"));

        //hashset to array
        String [] newArray = new  String[set.size()];
        set.toArray(newArray);
        for (String element:newArray)
        {
            System.out.println(element);
        }

        //hast set to another hasshset
        System.out.println(set.clone());



    }
}
