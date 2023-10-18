package com.LinkedList;

public class recursiveLinkedListRecursion {
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

    public Node recursiveLinkedListWithRecursion(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node newNode = recursiveLinkedListWithRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
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
        recursiveLinkedListRecursion list = new recursiveLinkedListRecursion();
        list.addFirst("Number");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();

        System.out.println("After Revers....................");
        list.head = list.recursiveLinkedListWithRecursion(list.head);
        list.printList();
    }
}
