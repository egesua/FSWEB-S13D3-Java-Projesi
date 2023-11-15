package com.egesua.oop;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("Lastname: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender(););
    }

}