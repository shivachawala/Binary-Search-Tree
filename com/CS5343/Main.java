package com.CS5343;

public class Main {

    public static void main(String[] args) {
	// write your code here

        bst node = new bst();
        Node root = node.rinsert(null,65);
        node.rinsert(root, 28);
        node.rinsert(root, 83);
        node.rinsert(root, 22);
        node.rinsert(root, 46);
        node.rinsert(root, 78);
        node.rinsert(root, 89);
        node.rinsert(root, 35);
        node.rinsert(root, 48);
        node.rinsert(root, 85);
        node.rinsert(root, 91);
        node.rinsert(root, 32);
        node.rinsert(root, 40);
        node.rinsert(root, 47);
        node.rinsert(root, 55);
        node.rinsert(root, 86);
        node.rinsert(root, 93);
        node.rinsert(root, 25);
        node.rinsert(root, 37);
        node.rinsert(root, 100);
        node.rinsert(root, 58);
        node.rinsert(root, 45);

        System.out.println("\nInorder traversal for Binary Search Tree");
        node.inorder(root);
        node.delete(root, 83);
        System.out.println("\nInorder traversal for Binary Search Tree after Delete");
        node.inorder(root);
        node.delete(root, 30);
        System.out.println("\nInorder traversal for Binary Search Tree");
        node.inorder(root);

    }
}
