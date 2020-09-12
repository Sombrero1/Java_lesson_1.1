package ru.sombrero1.java2;

import java.util.ArrayList;
import java.util.Arrays;

public class DogHome {
    private  Dog [] dogs;
    private int pointer=0;
    public DogHome() {

        dogs= new Dog[2];


    }
    private void isCompleted(int newDogs){

        if(dogs.length<pointer+newDogs){
            System.out.println("||Внимание!!! Слишком много собак! Расширяем питомник!||");
            dogs=Arrays.copyOf(dogs,dogs.length*3/2 + newDogs);

        }

    };
    public void showDogs(){
        for (int i=0; i<pointer; i++) {
            System.out.println(dogs[i]);

        }
    }



    public void addDog(Dog ... addDogObj){
        int j=0;
        isCompleted(addDogObj.length);

        System.out.println("-----------------");
        for(;j<addDogObj.length;pointer++,j++){
            System.out.println("Добавляем:" + addDogObj[j]);
            dogs[pointer]=addDogObj[j];

        }
        System.out.println("====Добавили=====\n");
    }

}
