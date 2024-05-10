package com.InheritenceExamples;

public class Employee1 {
    String name;
    int id;

    Employee1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails1() {
        System.out.println("Name of the employee is: " + name);
        System.out.println("Employee id: " + id);
    }



}
