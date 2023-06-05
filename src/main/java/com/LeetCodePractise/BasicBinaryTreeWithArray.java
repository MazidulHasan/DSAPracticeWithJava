package com.LeetCodePractise;

import java.util.Scanner;

public class BasicBinaryTreeWithArray {
    static Scanner sc = null;
    static class MyNode{
        int data;
        MyNode left, right;

        public MyNode(int data){
            this.data = data;
        }
    } 

    static MyNode createTree(){
        MyNode root = null;
        System.out.println("Enter Data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        else{
            root = new MyNode(data);
            System.out.println("Enter left data for: "+data);
            root.left = createTree();

            System.out.println("Enter right data for: "+ data);
            root.right = createTree();
        }
        return root;
    }
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        MyNode root =  createTree();
        System.out.println("Root data is :"+ root.data);
    }
}
