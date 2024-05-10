package com.bhuvama.workspace;

public class Developer extends Employee {
    Double basesalary= 3000.0;
    public Developer(String name, int id, double hourlyrate, int hoursworked) {
        super(name, id, hourlyrate, hoursworked);
    }

    @Override
    public Double CalculateSalary() {
        return super.CalculateSalary() + basesalary;
    }
}
