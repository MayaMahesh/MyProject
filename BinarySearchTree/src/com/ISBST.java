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
public class ISBST {
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
        int prev[] = {0};
        /*
        passing prev As an array rather than int value
        since passing an primitive data type (int) as reference doesnt work in java
        meaning prev value will no get updated in its recursive calls as it is not an object type
        */
        boolean isBst = isBstThree(root, prev);
         System.out.println("is given tree a bst::" + isBst);
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
    public static boolean isBstOne(BinarySearchTreeNode root) {
        if(root==null)
            return true;
        if(root.getLeft()!=null && (int)root.getData()<(int)FindMax(root.getLeft()).getData())
            return false;
        if(root.getRight()!=null && (int)root.getData()>(int)FindMin(root.getRight()).getData())
            return false;
        if(!isBstOne(root.getLeft()) || !isBstOne(root.getRight()))
            return false;
        return true;
    }
    public static boolean isBstTwo(BinarySearchTreeNode root,int min,int max) {
        if(root==null)
            return true;
        return((int)root.getData()>min && (int)root.getData()<max && isBstTwo(root.getLeft(), min, (int)root.getData())
                && isBstTwo(root.getRight(), (int)root.getData(), max));
    }
    public static BinarySearchTreeNode FindMax(BinarySearchTreeNode root) {
        if(root==null)
            return null;
        else if(root.getRight()==null)
            return root;
        else return(FindMax(root.getRight()));
    }
    public static BinarySearchTreeNode FindMin(BinarySearchTreeNode root) {
        if(root==null)
            return null;
        else if(root.getLeft()==null)
            return root;
        else return(FindMin(root.getLeft()));
    }
    public static boolean isBstThree(BinarySearchTreeNode root,int[] prev) {
        if(root==null)
            return true;
        if(!isBstThree(root.getLeft(), prev))
            return false;
        if((int)root.getData()<prev[0])
            return false;
        prev[0] = (int)root.getData();
        if(!isBstThree(root.getRight(), prev))
            return false;
        return true;
    }
}
