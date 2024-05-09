package com.example.abstractExamples;

public class Client {
    public static void main(String[] args) {
        B b = new B();
        b.getCategory();
        b.getDescription();
//        b.getName();
        b.print();
    }
}
