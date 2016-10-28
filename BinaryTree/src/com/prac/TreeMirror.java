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
public class TreeMirror {
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
        //n11.setRight(n22);
        root = n01;
        System.out.println("Given BinaryTree is:: \n" );
        printBinaryTree(root, 0);
        System.out.println("\n");
        MirrorTree(root);
        printBinaryTree(root, 0);
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
    public static void MirrorTree(BinaryTreeNode root) {
        BinaryTreeNode temp;
        if(root == null)
            return;
        if(root != null) {
            
            MirrorTree(root.getLeft());
            MirrorTree(root.getRight());
            temp = root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(temp);
            
                        
                                 
        }
    }
}
