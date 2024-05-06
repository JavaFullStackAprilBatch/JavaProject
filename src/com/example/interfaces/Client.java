package com.example.interfaces;

public class Client {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(FirstInterface.x);
        System.out.println(FirstInterface.y);
        B b = new B();
        b.firstMethod();
        b.secondMethod(5);
    }
}
