package com.AlphaReady.OOPS;

public class MultipleInterface {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.catmoves();
        t.dogMoves();
    }
}

interface Cat{
    void catmoves();
}

interface Dog{
    void dogMoves();
}

class Tiger implements Cat, Dog{

    @Override
    public void dogMoves() {
        // TODO Auto-generated method stub
        System.out.println("Dog Moves");
    }

    @Override
    public void catmoves() {
        // TODO Auto-generated method stub
        System.out.println("Cat moves");
    }

}
