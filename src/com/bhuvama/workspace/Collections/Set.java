package com.bhuvama.workspace.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        HashSet <String>s= new HashSet<String>();
        //add the values
        s.addAll(Arrays.asList("Hello", "world", "blue", "yellow", "white"));

        //Iteration Method
        System.out.println(s);
        Iterator it= s.iterator();
        while (it.hasNext())
        {

            System.out.println(it.next());
            s.remove("blue");

        }

//        for(String set:s)
//        {
//            System.out.println(set);
//        }

        //number of elements  in java
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.clone());
    }
}
