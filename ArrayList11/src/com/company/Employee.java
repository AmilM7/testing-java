package com.company;

public class Employee extends Person{
    private double Salary;

    public Employee(String firstName,String lastName , int yearOfBirth, double Salary) {
        super(firstName, lastName, yearOfBirth);
        this.Salary = Salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[ " + getFirstName() + " " + getLastName() + "]";
    }
}
