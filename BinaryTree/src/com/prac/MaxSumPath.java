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
public class MaxSumPath {
    public static void main(String[] args) {
        BinaryTreeNode root;
        BinaryTreeNode n01 = new BinaryTreeNode(1);
        BinaryTreeNode n11 = new BinaryTreeNode(2);
        BinaryTreeNode n12 = new BinaryTreeNode(3);
        BinaryTreeNode n21 = new BinaryTreeNode(4);
        BinaryTreeNode n22 = new BinaryTreeNode(5);
        BinaryTreeNode n31 = new BinaryTreeNode(6);
        BinaryTreeNode n32 = new BinaryTreeNode(7);
        n01.setLeft(n11);
        n01.setRight(n12);
        n11.setLeft(n21);
        n21.setLeft(n31);
        n21.setRight(n32);
        n11.setRight(n22);
        root = n01;
        System.out.println("Given BinaryTree is:: \n" );
        printBinaryTree(root, 0);
        int MaxSum = getMaxSum(root);
        System.out.println("MaxSum:: "+MaxSum);
        printPathWithMaxSum(root,8);
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
    public static int getMaxSum(BinaryTreeNode root) {
        if(root==null)
            return 0;
        int leftsum = getMaxSum(root.getLeft());
        int rightsum = getMaxSum(root.getRight());
        return (int)root.getData() + Math.max(leftsum, rightsum);
    }
    public static void printPathWithMaxSum(BinaryTreeNode root,int MaxSum) {
        int path[] = new int[256];
        int pathlen = 0;
        printPaths(root,MaxSum,path,pathlen);
    }
    public static void printPaths(BinaryTreeNode root,int MaxSum,int[] path,int pathlen) {
        if(root==null)
            return;
        path[pathlen] = (int)root.getData();
        pathlen++;
        MaxSum -= (int)root.getData();
        if(MaxSum==0) {
            printArray(path,pathlen);
        } else {
            printPaths(root.getLeft(), MaxSum, path, pathlen);
            printPaths(root.getRight(), MaxSum, path, pathlen);
        }
    }
    public static void printArray(int[] arr,int pathlen) {
        for(int i=0;i<pathlen;i++) {
            System.out.println(arr[i]);
        }
    }
    
}
