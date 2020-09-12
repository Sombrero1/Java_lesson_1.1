package ru.sombrero1.java2;

public class Programm {


    public static void main(String[] args) {
        DogHome mirea=new DogHome();
        mirea.addDog(new Dog("Putur", 15),new Dog("Gena", 3));
        mirea.addDog(new Dog("Razan", 15),new Dog("Murk", 3));
        mirea.addDog(new Dog("merq",30));
        mirea.addDog(new Dog("merz",30));
        mirea.addDog(new Dog("mers",30));
        mirea.addDog(new Dog("merg",30));
        mirea.addDog(new Dog("mern",30));
        mirea.addDog(new Dog("er",30),new Dog("gor",30),new Dog("mor",30),new Dog("grom",30));
        mirea.addDog(new Dog("dr",3));
        mirea.addDog(new Dog("Tor",3));
        mirea.addDog(new Dog("nor",3));
        mirea.showDogs();




    }
}