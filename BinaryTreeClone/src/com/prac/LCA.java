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
public class LCA {
    public static void main(String[] args) {
        BinaryTreeNode root;
        BinaryTreeNode node;
        BinaryTreeNode LCA;
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
        node = n32;
        System.out.println("Given BinaryTree is:: \n" );
        printBinaryTree(root, 0);
        LCA = LCArecurssive(root,n31,n22);
        System.out.println("The Least Common Ancestor of " + n31.getData() + " and " + n22.getData() + " is " + LCA.getData());
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
    private static BinaryTreeNode LCArecurssive(BinaryTreeNode root,BinaryTreeNode a,BinaryTreeNode b) {
        BinaryTreeNode left,right;
        if(root==null)
            return null;
        if(root==a||root==b)
            return root;
        left=LCArecurssive(root.getLeft(), a, b);
        right=LCArecurssive(root.getRight(), a, b);
        
        if(left!=null&&right!=null) return root;
        else return (left!=null)?left:right;
    }
}
