package com.alexshab;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int weight;
    private int growth;


    public Person(String firstName, String lastName, int age, int weight, int growth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + "years" +
                ", growth=" + growth + "cm" +
                ", weight=" + weight + "kg" +
                '}';
    }
}
