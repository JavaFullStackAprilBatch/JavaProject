package com.bhuvama.workspace;

public class Manager extends Employee{
    Double basesalary= 4000.0;
    public Manager(String name, int id, double hourlyrate, int hoursworked) {
        super(name, id, hourlyrate, hoursworked);
    }

    @Override
    public Double CalculateSalary() {
        return super.CalculateSalary() + basesalary;
    }
}
