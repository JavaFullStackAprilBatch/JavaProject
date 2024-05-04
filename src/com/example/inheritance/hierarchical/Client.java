package com.example.inheritance.hierarchical;

public class Client {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m3();

        B b = new B();
        b.m2();
        b.m1();

        A a = new A();
        a.m1();
    }
}
