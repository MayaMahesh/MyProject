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
public class SoretedArrayToBST {
    public static void main(String[] args) {
        int[] Arr = {4,8,11,14,19,21,23,25,31,39,42};
        BinarySearchTreeNode root = new BinarySearchTreeNode();
        root = arrayToBst(Arr, 0, Arr.length-1);
        printBinaryTree(root,0);
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
    public static BinarySearchTreeNode arrayToBst(int[] Arr, int left, int right) {
        if(left>right)
            return null;
        BinarySearchTreeNode newnode = new BinarySearchTreeNode();
        if(left==right) {
            newnode.setData(Arr[left]);
            newnode.setLeft(null);
            newnode.setRight(null);
        }else {
            int mid = left + (right-left)/2;
            newnode.setData(Arr[mid]);
            newnode.setLeft(arrayToBst(Arr, left, mid-1));
            newnode.setRight(arrayToBst(Arr, mid+1, right));
        }
        return newnode;
    }
}
