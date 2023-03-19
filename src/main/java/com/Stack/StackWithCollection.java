package com.Stack;

import java.util.Stack;

public class StackWithCollection {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(12);
        myStack.push(13);
        myStack.push(14);
        myStack.push(15);
        myStack.pop();
        
        while(!myStack.isEmpty()){
            System.out.println(myStack.peek());
            myStack.pop();
        }    
    }

}
