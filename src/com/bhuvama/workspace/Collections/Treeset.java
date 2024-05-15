package com.bhuvama.workspace.Collections;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {

        TreeSet<String> color=new TreeSet<String>();
        color.addAll(Arrays.asList("white","yellow","blue","green"));

        for(String ele:color)
        {
            System.out.println(ele);
        }


    }
}
