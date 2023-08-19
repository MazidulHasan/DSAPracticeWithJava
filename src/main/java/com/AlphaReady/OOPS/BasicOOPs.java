package com.AlphaReady.OOPS;

public class BasicOOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        BankAccount myAccount = new BankAccount();
        myAccount.username = "Joy";
        myAccount.setPassword("abcd");
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
    
}

class Student{
    String name;
    int age;
    float percentage;

    void claculatePercentage(int phy, int checm, int math){
        percentage = (phy+checm+math) / 3 ;
    }
}