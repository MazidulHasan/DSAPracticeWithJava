package com.Stack;

import java.util.Stack;

public class PushAtTheBottom {

    public static void PushAtBottom(int data, Stack<Integer> s){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        PushAtBottom(4,myStack);
        
        while(!myStack.isEmpty()){
            System.out.println(myStack.peek());
            myStack.pop();
        }    
    }
}
