package com.alexshab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonFactory {

    public static final Random RANDOM = new Random();
    public static final String[] FIRST_NAME = {"Victor", "John", "Jose", "Steve", "David", "Juan", "Don"};
    public static final String[] LAST_NAME = {"Elliott", "Harvey", "Rodgers", "Taylor", "Barnes", "Powers", "Wright"};


    public static List<Person> generatePersons(int count) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String firstName = FIRST_NAME[RANDOM.nextInt(FIRST_NAME.length)];
            String lastName = LAST_NAME[RANDOM.nextInt(LAST_NAME.length)];
            int age = RANDOM.nextInt(43) + 18;
            int weight = RANDOM.nextInt(51) + 150;
            int growth = RANDOM.nextInt(51) + 50;
            Person person = new Person(firstName, lastName, age, growth, weight);
            personList.add(person);
        }
        return personList;
    }
}
