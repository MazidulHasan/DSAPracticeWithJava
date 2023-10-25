package com.LinkedList;

public class isLinkedListPalindrom {
    Node head;
    class Node{
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null; 
        }
    }

    public void addFirst(String data){
        Node newdata = new Node(data);

        if (head == null) {
            head = newdata;
            return;
        }

        newdata.next = head;
        head = newdata;
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

    public boolean isPalindrom(){
        if (head == null || head.next == null) {
            return true;
        }

        Node midddle = findMiddleNode(head);
        Node secondHalfStart = reverseNode(midddle.next);

        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    public Node reverseNode(Node head){
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public Node findMiddleNode(Node head){
        Node hear = head;
        Node turtle = head;
        while (hear.next != null && hear.next.next != null) {
            hear = hear.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    public static void main(String[] args) {
        isLinkedListPalindrom list = new isLinkedListPalindrom();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("2");
        list.addFirst("1");

        System.out.println(list.isPalindrom());
    }
}
