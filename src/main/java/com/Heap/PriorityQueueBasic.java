package com.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueBasic {
    public static void main(String[] args) {

        // this will be asceding order
        // PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // priorityQueue.add(3);
        // priorityQueue.add(34);
        // priorityQueue.add(2);
        // priorityQueue.add(7);

        // while (!priorityQueue.isEmpty()) {
        //     System.out.println(priorityQueue.peek());
        //     priorityQueue.remove();
        // }

        // this will be decending order
        // PriorityQueue<Integer> priorityQueueReverseOrder = new PriorityQueue<>(Comparator.reverseOrder());
        // priorityQueueReverseOrder.add(3);
        // priorityQueueReverseOrder.add(34);
        // priorityQueueReverseOrder.add(2);
        // priorityQueueReverseOrder.add(7);

        // while (!priorityQueueReverseOrder.isEmpty()) {
        //     System.out.println(priorityQueueReverseOrder.peek());
        //     priorityQueueReverseOrder.remove();
        // }

        PriorityQueue<Student> priorityQueueStudent = new PriorityQueue<>();
        priorityQueueStudent.add(new Student("A", 4));
        priorityQueueStudent.add(new Student("A", 5));
        priorityQueueStudent.add(new Student("A", 2));
        priorityQueueStudent.add(new Student("A", 12));
        
        while (!priorityQueueStudent.isEmpty()) {
            System.out.println(priorityQueueStudent.peek().name+"   "+priorityQueueStudent.peek().rank);
            priorityQueueStudent.remove();
        }
    }

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
}
