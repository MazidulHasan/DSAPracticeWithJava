package com.AlphaReady.OOPS;

public class QuestionSix {
    public static void main(String[] args) {
        Vehicle obj = new Car();  
        // obj.print1();  //this is not possible

        // Car car = new Vehicle();
        // car.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle{
    void print1(){
        System.out.println("Car");
    }
}