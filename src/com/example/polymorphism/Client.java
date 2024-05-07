package com.example.polymorphism;

public class Client {
    public static void main(String[] args) {

        //method overloading
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.add(6,7));
        System.out.println(m.add(5l,6l));
        System.out.println(m.add(5.6,8.9,8.5));
        m.add(4.5, 6.8,2.4);

  Shape s = new Shape();
  s.draw(3);
  s.draw(5,6);

  ///method overriding

    B b = new B();
    A a1 = new A();
    A a2 = new B();
//    B b2 = new A();


    b.m1(5,6);  //class B
    a1.m1(6,7);  //class A
    a2.m1(8,9); // class B


        //interface

        MethodOverloadingInterface o = new  C();
        o.add(6,7);
        o.add(7,9,0);


    }
}
