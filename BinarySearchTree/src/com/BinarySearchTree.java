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
public class BinarySearchTree {
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
        root = Insert(root, 6);
        System.out.println("after inserting 6 BinaryTree is:: \n" );
        printBinaryTree(root, 0);
        root = deleteBSTNode(root, 4);
        System.out.println("after deleting 4 BinaryTree is:: \n" );
        printBinaryTree(root, 0);
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
    public static BinarySearchTreeNode Insert(BinarySearchTreeNode root,int data) {
        if(root == null) {
            root = new BinarySearchTreeNode();
            root.setData(data);
            root.setLeft(null);
            root.setRight(null);
        } else {
            if((int)root.getData()>data)
                root.setLeft(Insert(root.getLeft(), data));
            else if((int)root.getData()<data)
                root.setRight(Insert(root.getRight(), data));
        }
        return root;
    }
    public static BinarySearchTreeNode deleteBSTNode(BinarySearchTreeNode root,int data) {
        if(root==null)
            return null;
        else if((int)root.getData()>data)
            root.setLeft(deleteBSTNode(root.getLeft(), data));
        else if((int)root.getData()<data)
            root.setRight(deleteBSTNode(root.getRight(), data));
        else {
            if(root.getLeft()!=null && root.getLeft()!=null) {
                BinarySearchTreeNode temp = FindMax(root.getLeft());
                root.setData(temp.getData());
                root.setLeft(deleteBSTNode(root.getLeft(), (int)temp.getData()));
            } 
            BinarySearchTreeNode temp1 = root;
            if(root.getLeft()==null)
                root = root.getRight();
            else if(root.getRight()==null)
                root = root.getLeft();
        }
        return root;
    }
    public static BinarySearchTreeNode FindMax(BinarySearchTreeNode root) {
        if(root==null)
            return null;
        else if(root.getRight()==null)
            return root;
        else return(FindMax(root.getRight()));
    }
    
}
