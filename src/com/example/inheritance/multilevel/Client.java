package com.example.inheritance.multilevel;

public class Client {

    public static void main(String[] args) {
        C c = new C();
        c.m3(); // C method
        c.m2(); // B  method
        c.m1(); // A  B

        B b = new B();
        b.m1();
        b.m1();

        A a = new A();
        a.m1();

    }
}
