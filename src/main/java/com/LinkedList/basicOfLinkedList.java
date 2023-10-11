package com.LinkedList;

public class basicOfLinkedList {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }


    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next!=null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode =  head;
        while (currNode != null) {
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        basicOfLinkedList lsit = new basicOfLinkedList();
        lsit.addFirst("a");
        lsit.addFirst("is");
        lsit.printList();

    }
}
