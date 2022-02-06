package com.alexshab;

import java.util.List;

public class Main {

    public static void main(String[] args){
        PersonFactory factory = new PersonFactory();
        List<Person> personList = factory.generatePersons(100);
        System.out.println(personList);
    }
}
