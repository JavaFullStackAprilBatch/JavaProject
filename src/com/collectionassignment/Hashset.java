package com.collectionassignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10};

        int result=unique(array);
        System.out.println(result);

    }
    public static int unique(int[] array)
    {

        Set<Integer> set=new HashSet<>();
        for(int srt:array)
        for(int element:array)
        {
            set.add(element);
        }
        return set.size();
    }
}
