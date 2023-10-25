package com.LinkedList;

public class findTheNthNodeFromLast {
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

    public String findTheNthNode(int number){
        Node currentNode = head;
        int count = 1;
        while (count !=number) {
            // System.out.println(currentNode.data);
            currentNode = currentNode.next;
            count++;
        }
        return currentNode.data;
    }

    public void findNthElementFromLast(int number){
        Node curNode = head;
        Node curNode2 = head;
        int listlength = 0;
        while (curNode.next != null) {
            curNode = curNode.next;
            listlength++;
        }
        int position = (listlength-number) +1;
        System.out.println("Need to find "+position+" nth position");
        int count2 = 1;
        while (count2 != position) {
            curNode2 = curNode2.next;
            count2++;
        }

        //delete the node
        Node currentNodeD = head;
        Node prevNode = null;
        int index = 1;
        while (currentNodeD != null && index < position) {
            prevNode = currentNodeD;
            currentNodeD = currentNodeD.next;
            index++;
        }
        prevNode.next = currentNodeD.next;

        // return prevNode;
    }

    public static void main(String[] args) {
        findTheNthNodeFromLast list = new findTheNthNodeFromLast();
        list.addFirst("Number");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        // list.printList();

        // System.out.println(list.findTheNthNode(2));
        list.findNthElementFromLast(2);
        list.printList();
    }
}
