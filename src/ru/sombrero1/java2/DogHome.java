package ru.sombrero1.java2;

import java.util.ArrayList;

public class DogHome {
    private ArrayList<Dog> dogs;
    public DogHome() {
        dogs= new ArrayList<Dog>();


    }
    public void addDog(Dog dog){
        System.out.println("Добавляем:" + dog);
        dogs.add(dog);



    }

}
