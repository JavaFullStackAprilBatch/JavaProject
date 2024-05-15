package com.bhuvama.workspace.Collections;

import java.util.HashMap;
import java.util.Set;

public class Hashcode {
    public static void main(String[] args) {
        String name= "Bhuvana";
        Integer a=10345;
        int code= a.hashCode();
        System.out.println(code);

        HashMap<String, String> map = new HashMap<>();
        map.put("hello","world");
        map.put("ss","sss");
        map.put("sssss","fsdfe");
       Set <String> he=map.keySet();
        for(String h:he)
        {
            String value=map.get(h);
            System.out.println("key=" +h +",  value=" + value);
        }


    }
}
