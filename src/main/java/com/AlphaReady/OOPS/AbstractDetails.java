package com.AlphaReady.OOPS;

public class AbstractDetails {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        myHorse.MustangDetails();
        myHorse.walk();
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Horse walk");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor");
    }
    void MustangDetails(){
        System.out.println("Details of Mustang");
    }
}
