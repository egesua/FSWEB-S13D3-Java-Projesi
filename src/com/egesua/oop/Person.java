package com.egesua.oop;

public class Person {
    String firstName;
    String lastName;
    int age;
    int height;
    int weight;
    String gender;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int height, int weight, String gender){
        this(firstName, lastName, age);
        this.height = height;
        this.weight = weight;
        this.setGender(gender);
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
    
    public void getGender(){
        if("male".equalsIgnoreCase(gender) || "female".equalsIgnoreCase(gender)){
            this.gender = gender;
        } else {
            this.gender = "unknown";
        }
    }
}

