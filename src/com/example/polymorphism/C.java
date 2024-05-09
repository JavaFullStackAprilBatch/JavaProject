package com.example.polymorphism;

public class C implements MethodOverloadingInterface{
    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int add(int a, int b, int c) {
        return 0;
    }

    @Override
    public int add(int a, int b, int c, int d) {
        return 0;
    }
}
