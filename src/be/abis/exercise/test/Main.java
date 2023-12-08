package be.abis.exercise.test;

import be.abis.exercise.model.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Tim");
        System.out.println(p.getName());
    }
}
