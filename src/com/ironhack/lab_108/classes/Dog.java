package com.ironhack.lab_108.classes;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private final long id = 3;







    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;



    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
