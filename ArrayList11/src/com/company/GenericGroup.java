package com.company;

import java.util.ArrayList;

public class GenericGroup <GenericType>  {
    private String name;
    private ArrayList<GenericType>  pArraylist;


    public GenericGroup(String name) {
        this.name = name;
        this.pArraylist = new ArrayList<>();
    }

    public void addElement (GenericType a) {this.pArraylist.add(a);}

    @Override
    public String toString() {
        String out = " ";
        for (GenericType a : pArraylist) {
            out += a + ", " ;
        }
        return out;
    }
}
