package com.MyLinkedList;

public class MyLinkedList {
    MyNode head;

    public class MyNode {
        String data;
        MyNode next;

        MyNode(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add to firs position
    public void addNodeInFirst(String data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add to last Position
    public void addNodeIndLastPosition(String data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        MyNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // print List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        MyNode currrentNode = head;
        while (currrentNode != null) {
            System.out.print(currrentNode.data + " -> ");
            currrentNode = currrentNode.next;
        }
        System.out.println();
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is null");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is null");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        MyNode secondLast = head;
        MyNode last = head.next;

        while (last.next != null) {
            secondLast = secondLast.next;
            last = last.next;
        }

        secondLast.next = null;

    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNodeInFirst("Is");
        myLinkedList.addNodeInFirst("a");
        myLinkedList.printList();
        myLinkedList.addNodeIndLastPosition("Last");
        myLinkedList.printList();
        myLinkedList.deleteFirst();
        myLinkedList.printList();
        myLinkedList.deleteLast();
        myLinkedList.printList();
    }
}
