package com.startjava.lesson2_3_4.animal;

public class Wolf {
    private String name;
    private int age;
    private String color;
    private int weight;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        if (age > 8) {
            System.out.println("Введён не корректный возраст волка по имени " + getName());
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void move(){
        System.out.println("Волк начал движение");
    }

    public void sitDown() {
        System.out.println("Волк сел");
    }

    public void run() {
        System.out.println("Волк побежал");
    }

    public void howl() {
        System.out.println("Волк воет");
    }

    public void hunt() {
        System.out.println("Волк начал охотится!!!");
    }
}