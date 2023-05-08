package com.Heap;

import java.util.*;

public class heapBasic {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<Integer>();

        public void add(int data){ //o(logn) 
            //add at last idx
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;

            while (arr.get(x)<arr.get(par)) { //o(logn) 
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x= par;
                par = (x-1)/2;
            }
        }
    
        public int peek(){
            return arr.get(0);
        }

        public int remove(){
            // Steps for delete in heap:
            // 1. 1st and last node swap
            // 2. remove last index 
            //     arr.remove(arr.size()-1)
            // 3. Fix my heap with heapify

            int data = arr.get(0);

            //step 1 - swap last and first
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2 - delete last
            arr.remove(arr.size()-1);

            //step 3- heapify
            heapify(0);
            return data;
        }

        private void heapify(int idx){
            int minidx = idx;
            int left = 2*idx+1;
            int right = 2*idx+2;

            if (left < arr.size() && arr.get(minidx) > arr.get(left)) {
                minidx = left;
            }

            if (right < arr.size() && arr.get(minidx) > arr.get(right)) {
                minidx = right;
            }

            if (minidx != idx) {
                //swap
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minidx));
                arr.set(minidx, temp);

                heapify(minidx);
            }
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}


// heap has these properties:
// 1. Binary tree: at most 2 children
// 2. Complete binary tree: where all levels are complitely filled except possibly the last one
//                         which is filled from left to right
// 3. Heap order property:
//     Children >= Parent (minHeap)
//     Children <= Parent (maxHeap)

// ** Heap is not implemented as a class::
//     This is beause time complexiety. First to insert a node we will need a time, then to fix that node position (max or minn heap)
//     we will be needing extra time. To overcome these problem we use array or array list and it is easy to represent in binary tree
    // (complete binary tree)

    // Compute:
    // index=i
    // left child: 2i+1
    // ringht child:2i+2
    // to find Parent index of a child: (x-1)/2