package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Person person = new Person ("Emir"," Spahić", 1998);
    Employee employee = new Employee("Amil","Murselović", 1997, 2500 );
    Student student = new Student("Irfan", "Paric" , 2000, 1);

    Group grupa = new Group ("SSST first");
    grupa.addPerson(student);
    grupa.addPerson(employee);

    GenericGroup <Person> grupa2 = new GenericGroup("SSST second") ;
    grupa2.addElement(employee);
    grupa2.addElement(student);

    System.out.println(grupa);
    System.out.println();
    System.out.print(grupa2);

    GenericGroup <String> grupa3 = new GenericGroup("Tests") ;
    grupa3.addElement("Test1");
    grupa3.addElement("Test2");
    grupa3.addElement("Test3");
    System.out.println();

    System.out.println(grupa3);

    ArrayList<Person> pArrayList = new ArrayList<Person>();
    System.out.println (" pArrayList size = " + pArrayList.size());
    pArrayList.add(student);
    pArrayList.add(employee);
    System.out.println (" pArrayList size = " + pArrayList.size());

        for ( Person a : pArrayList) {
            if (a.getClass()==Student.class) System.out.println(a + ", year of study: " + ((Student) a).getYearOfStudy());
            else System.out.println(a);
        }

        System.out.println();

        pArrayList.remove(1);
        System.out.println(pArrayList.size());
        pArrayList.clear();
        System.out.println(pArrayList.size());

    }

}
