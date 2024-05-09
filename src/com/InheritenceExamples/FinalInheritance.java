package com.InheritenceExamples;

public class FinalInheritance {

    public static class EmployeeMain11 {
        public static void main(String[] args) {

            Manager1 m = new Manager1("Manager",1,1100);
            m.displayDetails1();
            m.calculateSalary();

            Developer1 d = new Developer1("Developer",2,100);
            d.displayDetails1();
            d.calculateSalary();

            Tester1 t = new Tester1("Tester",3,10);
            t.displayDetails1();
            t.calculateSalary();

        }



    }
}
