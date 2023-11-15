package com.egesua.oop;

public class Person {
    String firstName;
    String lastName;
    int age;
    int height;
    int weight;
    int salary;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int height, int weight, int salary){
        this(firstName, lastName, age);
        this.height = height;
        this.weight = weight;
        this.salary = salary;
    }
    
    //Methods...
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }

}

