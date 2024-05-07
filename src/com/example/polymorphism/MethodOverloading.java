package com.example.polymorphism;

public class MethodOverloading {

    public int add(int a, int b) {
        return a + b;
    }

     double add(double a, double b, double c) {
        return a + b + c;
    }
    protected long add(long a, long b) {
        return a + b;
    }
}
