package ru.sombrero1.java2;

import java.util.ArrayList;

public class DogHome {
    private  Dog [] dogs;
    private int i=0;
    public DogHome() {
        dogs= new Dog[100];


    }
    public void addDog(Dog ... dog){


        int j=0;
        for(;j<dog.length;i++,j++){
            System.out.println("Добавляем:" + dog[j]);
            dogs[i]=dog[j];

        }
        System.out.println("====Добавили=====");
    }

}
