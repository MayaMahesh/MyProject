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
public class FloornCeil {
    public static void main(String[] args) {
        BinarySearchTreeNode root;
        BinarySearchTreeNode n01 = new BinarySearchTreeNode(4);
        BinarySearchTreeNode n11 = new BinarySearchTreeNode(2);
        BinarySearchTreeNode n12 = new BinarySearchTreeNode(6);
        BinarySearchTreeNode n21 = new BinarySearchTreeNode(1);
        BinarySearchTreeNode n22 = new BinarySearchTreeNode(3);
        BinarySearchTreeNode n31 = new BinarySearchTreeNode(5);
        BinarySearchTreeNode n32 = new BinarySearchTreeNode(7);
        n01.setLeft(n11);
        n01.setRight(n12);
        n11.setLeft(n21);
        n11.setRight(n22);
        n12.setRight(n32);
        n12.setLeft(n31);
        root = n01;
        System.out.println("Given BinaryTree is:: \n" );
        printBinaryTree(root, 0);
        BinarySearchTreeNode floor = new BinarySearchTreeNode();
        BinarySearchTreeNode prev = new BinarySearchTreeNode();
        floor = bstFloor(root, 8, prev);
        System.out.println("floor of given data is"+(int)floor.getData());
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
    public static BinarySearchTreeNode bstFloor(BinarySearchTreeNode root,int data,BinarySearchTreeNode prev) {
        if(root==null)
            return null;
        if((int)root.getData()==data)
            return root;
        if((int)root.getData()>data)
            return bstFloor(root.getLeft(),data,prev);
        if((int)root.getData()>data)
            return prev;
        prev = root;
        if((int)root.getData()<data)
            return bstFloor(root.getRight(), data, prev);
        return prev;
    }
}
