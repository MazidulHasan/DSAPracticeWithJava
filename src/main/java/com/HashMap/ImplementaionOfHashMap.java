package com.HashMap;

import java.util.*;

public class ImplementaionOfHashMap {
    
    //hash map internally made with array of linked list
    public static class HashMap<K,V> {
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // total number of nodes
        private int N; //total number of buckets
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N; //must be between 0 to N-1
        }

        private int searInLL(K key, int bi){
            LinkedList<Node> li = buckets[bi];
            for (int i = 0; i < li.size(); i++) {
                if (li.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for (int i = 0; i < N*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> li = oldBucket[i];
                for (int j = 0; j < li.size(); j++) {
                    Node node = li.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searInLL(key,bi);

            if (di == -1) {
                //key dosent exist
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                //key exists
                Node data = buckets[bi].get(di);
                data.value = value;
            }
            double lamda = (double)n/N;
            if (lamda>2.0) {
                //rehashing
                rehash();
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bangladesh", 100);
        map.put("India",50);
        map.put("Nepal",150);
    }

}
