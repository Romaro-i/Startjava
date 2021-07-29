package com.startjava.lesson2_3_4.animal;

public class WolfTest {
    public static void main(String[] arg) {
         Wolf wolf1 = new Wolf();
        wolf1.setName("Волчок");
        wolf1.setAge(10);
        wolf1.setColor("Серый");
        wolf1.setWeight(20);
        wolf1.setGender("самец");
        System.out.println("Волка зовут " + wolf1.getName());
        System.out.println("Возраст волка (лет) " + wolf1.getAge());
        System.out.println("Окрас " + wolf1.getColor());
        System.out.println("Вес волка = " + wolf1.getWeight() + " кг.");
        System.out.println("Пол - " + wolf1.getGender());

        wolf1.move();
        wolf1.sitDown();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}