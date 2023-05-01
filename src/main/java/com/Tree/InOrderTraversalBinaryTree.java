package com.Tree;

public class InOrderTraversalBinaryTree {
    
    static class Node {
        int data;
        Node left;
        Node right;
 
 
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
 
    static class BinaryTree {
        static int idx = -1;
        public Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
 
    static void inOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data);
        inOrderTraversal(root.right);

    }

    static void preOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data);
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }

    static void postOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.print(root.data);
    }
 
    public static void main(String args[]) {
        int nodes[] = {10,20,-1,30,40,-1, -1, -1,50,60,-1, -1, -1};
        BinaryTree tree = new BinaryTree();
       
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        System.out.println("In order");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Pre order");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("Post order");
        postOrderTraversal(root);
        System.out.println();

    }
}
