package com.example.inheritance.singleInheritance;

public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat("eating ---------");
        dog.bark();


        Animal animal = new Animal();
        animal.eat("eating .........");


    }
}
