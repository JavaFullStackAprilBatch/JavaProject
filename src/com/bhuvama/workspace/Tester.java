package com.bhuvama.workspace;

public class Tester extends Employee{
    public Tester(String name, int id, double hourlyrate, int hoursworked) {
        super(name, id, hourlyrate, hoursworked);
    }
    Double basesalary= 2000.0;
    @Override
    public Double CalculateSalary() {
        return super.CalculateSalary() + basesalary;
    }
}
