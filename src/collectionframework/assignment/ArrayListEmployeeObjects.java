package collectionframework.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEmployeeObjects {
    public static void main(String[] args) {
        try {
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Employee("John", 55, "India"));
            employees.add(new Employee("Alice", 35, "USA"));
            employees.add(new Employee("Jack", 40, "Canada"));
            employees.add(new Employee("Jim", 60, "Scotland"));
            employees.add(new Employee("Riya", 45, "Nepal"));
            employees.add(new Employee("Samara", 58, "Bangladesh"));
            employees.add(new Employee("Cameran", 30, "Kenya"));
            System.out.println("Employee names whose age is more than 50 : ");
            for (Employee emp : employees) {
                if (emp.getAge() > 50) {
                    System.out.println(emp.getName());
                }
            }
            System.out.println("Employee list after removing all the employees who resides in USA : ");
            Iterator<Employee> iterator = employees.iterator();
            while (iterator.hasNext()) {
                Employee emp = iterator.next();
                if (emp.getCountry().equalsIgnoreCase("USA")) {
                    iterator.remove();

                }

            }
            System.out.println(employees);
            System.out.println("Employee list after sorting by country name : ");
            Collections.sort(employees, new SortByCountry());
            System.out.println(employees);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}







