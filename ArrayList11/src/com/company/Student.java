package com.company;

public class Student extends Person {
    int yearOfStudy;

    public Student(String firstName, String lastName, int yearOfBirth, int yearOfStudy) {
        super(firstName, lastName, yearOfBirth);
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student [ " + getFirstName() + " " + getLastName() + " ]";
    }
}
