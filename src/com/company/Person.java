package com.company;

public class Person {

    String name;
    int age;


    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " " + age;
    }
    public int hasBirthday(){
        int bDay = age + 1;
        return bDay;
    }

}