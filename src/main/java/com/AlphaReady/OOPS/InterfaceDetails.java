package com.AlphaReady.OOPS;

public class InterfaceDetails {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChecssPlayer{
    void moves(); //by default public and abstract
}

class Queen implements ChecssPlayer{
    public void moves(){
        System.out.println("up down left right diagonal");
    }
}

class Rook implements ChecssPlayer{
    public void moves(){
        System.out.println("up down left right");
    }
}

class King implements ChecssPlayer{
    public void moves(){
        System.out.println("up down left right diagonal by one step");
    }
}
