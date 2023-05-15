package com.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }
}

public class Comparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        Collections.sort(people);  // Sorts the list based on age

        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}