/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prac;

import com.BinaryTreeNode;

/**
 *
 * @author j1016767
 */
public class BinaryTreePostOrder {
     public static void main(String[] args) {
        BinaryTreeNode root;
        BinaryTreeNode n01 = new BinaryTreeNode(1);
        BinaryTreeNode n11 = new BinaryTreeNode(2);
        BinaryTreeNode n12 = new BinaryTreeNode(3);
        BinaryTreeNode n21 = new BinaryTreeNode(4);
        BinaryTreeNode n22 = new BinaryTreeNode(5);
        n01.setLeft(n11);
        n01.setRight(n12);
        n11.setLeft(n21);
        n11.setRight(n22);
        root = n01;
        System.out.println("Given BinaryTree is:: \n" );
        printBinaryTree(root, 0);
        System.out.println("\n");
        System.out.println("PostOrder Traversal of given Tree is::" );
        PostOrderRecursive(root);
        System.out.println("\n");
    }
    public static void printBinaryTree(BinaryTreeNode root, int level){
    if(root==null)
         return;
    printBinaryTree(root.getRight(), level+1);
    if(level!=0){
        for(int i=0;i<level-1;i++)
            System.out.print("|\t");
            System.out.println("|-------"+root.getData());
    }
    else
        System.out.println(root.getData());
    printBinaryTree(root.getLeft(), level+1);
}    
    public static void PostOrderRecursive(BinaryTreeNode root) {
        if(root==null) {
            return;
        }
        PostOrderRecursive(root.getLeft());
        PostOrderRecursive(root.getRight());
        System.out.print(root.getData());
    }
    
}
