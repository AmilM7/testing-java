package com.company;

import java.util.ArrayList;

public class Group {
    private String name;
     private ArrayList<Person> pArrayList;

    public Group(String name) {
       pArrayList = new ArrayList<Person>();
       this.name = name;
    }

    public void addPerson ( Person a) { this.pArrayList.add(a);}


    @Override
    public String toString() {
        String out = " ";
        for (Person a: pArrayList) {
            out += a + ", ";
        }
        return out;
    }
}
