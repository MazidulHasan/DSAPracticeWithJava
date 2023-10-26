package com.LinkedList;

public class detectCycleInLinkedList {
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

    public boolean hasCycle(){
        if(head == null){
            return false;
        }
        Node fastNode = head;
        Node slowNode = head;

        while (fastNode != null && fastNode.next!=null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if (slowNode == fastNode) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        detectCycleInLinkedList list = new detectCycleInLinkedList();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("2");
        list.addFirst("1");
        System.out.println(list.hasCycle());
    }
}
