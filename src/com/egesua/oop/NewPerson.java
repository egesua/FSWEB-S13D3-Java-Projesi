package com.egesua.oop;

public class NewPerson {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private int number;
    private String gender;

    public NewPerson(String firstName, int age, String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    public NewPerson(String firstName, String lastName, int age, String address, int number, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.number = number;
        this.gender = gender;
    }

    public String getFirstName() {
        return getFirstName();
    }

    public String getLastName() {
        return getLastName();
    }

    public int getAge() {
        return getAge();
    }

    public boolean isTeen() {
        if(age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }

}
