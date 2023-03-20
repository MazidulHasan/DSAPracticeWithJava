package com.MyQueue;

public class QueueWithCircularArray {
    static class Queue{

        // note
        // to achive a circular array, if we are at the last position of array
        // then we need to add data to the front of array. So  we need to 
        // go to the first element. But here front is also increasing. So for 
        // this we can use this formula;
        // (rear+1) % size;

        static int arr[];
        static int size;
        static int rear=-1;
        static int front =-1;

        Queue(int arraySize){
            arr = new int[arraySize];
            Queue.size = arraySize;
        }


        public static boolean isEmpty(){
            return rear == -1 && front== -1;
        }

        public static boolean isFull(){
            return (rear+1) % size == front;  
        }

        public static void add(int data){
            if (isFull()) {
                System.out.println("The queue is full");
                return;
            }

            //After 1st element add, update the front
            if (front == -1) {
                front = 0;
            }

            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
            }

            int result = arr[front];
            if (rear == front) {
                //if there is only a single value is available 
                rear = front = -1;
            }else{
                front = (front+1) % size; 
            }

            return result;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
