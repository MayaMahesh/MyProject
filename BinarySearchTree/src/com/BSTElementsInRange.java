/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

/**
 *
 * @author j1016767
 */
public class BSTElementsInRange {
    public static void main(String[] args) {
        BinarySearchTreeNode root;
        BinarySearchTreeNode n01 = new BinarySearchTreeNode(4);
        BinarySearchTreeNode n11 = new BinarySearchTreeNode(2);
        BinarySearchTreeNode n12 = new BinarySearchTreeNode(5);
        BinarySearchTreeNode n21 = new BinarySearchTreeNode(1);
        BinarySearchTreeNode n22 = new BinarySearchTreeNode(3);
        n01.setLeft(n11);
        n01.setRight(n12);
        n11.setLeft(n21);
        n11.setRight(n22);
        root = n01;
        System.out.println("Given BinaryTree is:: \n" );
        printBinaryTree(root, 0);
        elementsInRange(root, 2, 5);
        System.out.println("");
    }
    public static void printBinaryTree(BinarySearchTreeNode root, int level){
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
    public static void elementsInRange(BinarySearchTreeNode root, int k1, int k2) {
        if(root==null)
            return;
        if((int)root.getData()>k1)
            elementsInRange(root.getLeft(), k1, k2);
        if(k1<=(int)root.getData()&&(int)root.getData()<=k2)
            System.out.print((int)root.getData());
        if((int)root.getData()<k2)
            elementsInRange(root.getRight(), k1, k2);
    }
}
