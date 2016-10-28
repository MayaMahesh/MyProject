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
public class TreeDiameter {
    public static void main(String[] args) {
        BinaryTreeNode root;
        BinaryTreeNode n01 = new BinaryTreeNode(1);
        BinaryTreeNode n11 = new BinaryTreeNode(2);
        BinaryTreeNode n12 = new BinaryTreeNode(3);
        BinaryTreeNode n21 = new BinaryTreeNode(4);
        BinaryTreeNode n22 = new BinaryTreeNode(5);
        BinaryTreeNode n31 = new BinaryTreeNode(6);
        BinaryTreeNode n32 = new BinaryTreeNode(7);
        BinaryTreeNode n33 = new BinaryTreeNode(8);
        BinaryTreeNode n46 = new BinaryTreeNode(10);
        BinaryTreeNode n41 = new BinaryTreeNode(11);
        n01.setLeft(n11);
        n01.setRight(n12);
        n11.setLeft(n21);
        n21.setLeft(n31);
        n21.setRight(n32);
        n11.setRight(n22);
        n22.setRight(n33);
        n33.setRight(n46);
        n31.setLeft(n41);
        root = n01;
        System.out.println("Given BinaryTree is:: \n" );
        printBinaryTree(root, 0);
        System.out.println("Diameter of given tree is :: "+Diameter_of_tree(root));
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
    public static int tree_height(BinaryTreeNode root) {
        if(root==null)
            return 0;
        int left_height,right_height;
        left_height = tree_height(root.getLeft());
        right_height = tree_height(root.getRight());
        return (Math.max(left_height, right_height)+1);
    }
    public static int Diameter_of_tree(BinaryTreeNode root) {
        if(root==null)
            return 0;
        int left_diameter,right_diameter;
        int left_height,right_height;
        left_height = tree_height(root.getLeft());
        right_height = tree_height(root.getRight());
        
        left_diameter = Diameter_of_tree(root.getLeft());
        right_diameter = Diameter_of_tree(root.getRight());
        
        return Math.max((left_height+right_height+1),Math.max(left_diameter, right_diameter));
    }
}
