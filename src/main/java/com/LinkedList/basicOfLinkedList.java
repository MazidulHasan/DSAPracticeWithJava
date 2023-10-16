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

    //delete first
    public void deleteFirst(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        head = head.next;
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

    //delete last
    public void deleteLast(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
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
        lsit.addLast("last");;
        lsit.printList();
        lsit.deleteFirst();
        lsit.deleteLast();

    }
}
