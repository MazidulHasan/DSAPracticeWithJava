package com.LinkedList;

public class InsertAndDeleteInSpecPosition {

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

    public void deleteAtSpecficPosition(int position){
        if (head == null) {
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node currNode = head;
        Node previousNode = null;
        int index = 0;

        while (currNode != null && index < position) {
            previousNode = currNode;
            currNode = currNode.next;
            index++;
        }

        if (currNode == null) {
            return;
        }

        previousNode.next = currNode.next;
    }

    public void insertAtSpecificPosition(String data, int position){
        Node newData = new Node(data);
        if (head == null) {
            return;
        }

        if(position == 0){
            Node temp = head;
            head = newData;
            head.next = temp;
            return;
        }

        Node currNode = head;
        Node previousNode = null;
        int index = 0;

        while (currNode != null && index < position) {
            previousNode = currNode;
            currNode = currNode.next;
            index++;
        }

        if (currNode == null) {
            return;
        }

        previousNode.next = newData;
        newData.next = currNode;
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
        InsertAndDeleteInSpecPosition list = new InsertAndDeleteInSpecPosition();
        list.addFirst("Number");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");

        list.deleteAtSpecficPosition(2);
        // list.printList();

        list.insertAtSpecificPosition("NewData",2);
        list.printList();
    }
}
