package com.Stack;

import java.util.ArrayList;

public class StackWithArrayList {
    static class MyStack{
        ArrayList<Integer> list = new ArrayList<Integer>();

        public boolean isEmpty(){
            return list.size() == 0;
        }

        public void Mypush(int data){
            list.add(data);
        }

        public int Mypop() {
            if (isEmpty()) {
                return -1;
            }
            
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int Mypeek(){
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.Mypush(12);
        myStack.Mypush(13);
        myStack.Mypush(14);
        myStack.Mypush(15);
        myStack.Mypop();

        while(!myStack.isEmpty()){
            System.out.println(myStack.Mypeek());
            myStack.Mypop();
        }
    }
}
