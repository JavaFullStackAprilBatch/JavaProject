package com.collectionassignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<Employee> employee = new java.util.ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("Smith");
        emp1.setAge(52);
        emp1.setLocation("USA");

        Employee emp2 = new Employee();
        emp2.setName("Bos");
        emp2.setAge(40);
        emp2.setLocation("CANADA");


        Employee emp3 = new Employee();
        emp3.setName("Hobbs");
        emp3.setAge(56);
        emp3.setLocation("USA");

        Employee emp4 = new Employee();
        emp4.setName("Ananya");
        emp4.setAge(7);
        emp4.setLocation("India");

        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        employee.add(emp4);


        //Print all the Employee names whose age is more than  50
        for (Employee e : employee) {
            try {
                if (e.getAge() > 50) {
                    System.out.println(e.getName());
                }
            }catch (Exception error)
            {
                error.printStackTrace();
            }



        }
        System.out.println("Remoed USA Employee");
        for (Employee e1 : employee) {
            if (!e1.getLocation().equals("USA")) {

                System.out.println((e1.getName()) + "    " + e1.getLocation());
            }


        }


        Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getLocation().compareToIgnoreCase(e2.getLocation());
            }
        });

        // Print the sorted list
        System.out.println("\nSorted Order by Location:");
        for (Employee e : employee) {
            System.out.println(e);
        }


    }
}