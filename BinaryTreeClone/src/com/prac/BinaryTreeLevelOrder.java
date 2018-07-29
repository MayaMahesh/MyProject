/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prac;

import com.BinaryTreeNode;
import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author j1016767
 */
public class BinaryTreeLevelOrder {
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
        levelOrderTraversal(root);
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
    private static void levelOrderTraversal(BinaryTreeNode root) {
        if(root == null) return;
        BinaryTreeNode temp = new BinaryTreeNode();
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
            temp = q.poll();
            System.out.print(temp.getData());
            if(temp.getLeft() != null) {
                q.add(temp.getLeft());
            }
            if(temp.getRight() != null) {
                q.add(temp.getRight());
            }
        }
        q.clear();
    }
}
