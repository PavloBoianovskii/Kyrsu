package com.company;

import java.util.Calendar;

public class Person {
private String firstName;
private  String lastName;
private int birthYer;
private int age;

public void getAge(){
    this.age = Calendar.getInstance().get(Calendar.YEAR) - birthYer;
}

public void Input(String name,String surname,int birth){
    this.setFirstName(name);
    this.setLastName(surname);
    this.setBirthYer(birth);
}

    public String output(Person p){
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYer=" + birthYer +
                ", age=" + age +
                '}';

}

public void changeName(String name,String surname){
    if(surname == null){
    this.setFirstName(name);
    }
    else if(name == null){
    this.setLastName(surname);
    }
    else {this.setFirstName(name);
    this.setLastName(surname);
    }
}
  /////////////////////////////////////////////////////
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYer() {
        return birthYer;
    }

    public void setBirthYer(int birthYer) {
        this.birthYer = birthYer;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
