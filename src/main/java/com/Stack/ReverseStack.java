package com.Stack;

import java.util.Stack;

public class ReverseStack {
    public static void PushAtBottom(int data, Stack<Integer> s){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(data, s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        PushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        reverseStack(myStack);
        
        while(!myStack.isEmpty()){
            System.out.println(myStack.peek());
            myStack.pop();
        }    
    }
}
