package com.Stack;


public class StackWithLinkedList {
    static class Mynode {
        int data;
        Mynode next;

        public Mynode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class MyStack {
        public Mynode head;

        public boolean isEmpty() {
            return head == null;
        }

        public void Mypush(int data) {
            Mynode newnode = new Mynode(data);
            if (isEmpty()) {
                head = newnode;
            }
            newnode.next = head;
            head = newnode;
            System.out.println(data);
        }

        public int Mypop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            System.out.println(top);
            return top;
        }

        public int Mypeek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public void StackPrintWithPop(MyStack stack) {
            while (!stack.isEmpty()) {
                System.out.print(stack.Mypeek());
                stack.Mypop();
            }
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.Mypush(12);
        myStack.Mypush(13);
        myStack.Mypush(14);
        myStack.Mypush(15);
        myStack.Mypop();
        
        // while(!myStack.isEmpty()){
        //     System.out.println(myStack.Mypeek());
        //     myStack.Mypop();
        // }
    }
}
