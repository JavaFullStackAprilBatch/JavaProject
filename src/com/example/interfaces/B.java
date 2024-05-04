package com.example.interfaces;

public class B  implements  FirstInterface, SecondInterface {

    @Override
    public void firstMethod() {
        System.out.println("First Method");

    }

    @Override
    public void secondMethod(int x) {

    }

    @Override
    public String m4() {
        return "";
    }

    @Override
    public void secondMethod(int x, int y) {

    }


}
