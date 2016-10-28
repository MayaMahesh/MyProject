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
public class IsCompleteBTree {
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
        //n21.setRight(n32);
        n11.setRight(n22);
        root = n01;
        System.out.println("Given BinaryTree is:: \n" );
        printBinaryTree(root, 0);
        int num_of_nodes = treeSize(root);
        //System.out.println("isCopmletetree: "+isCompleteBinaryTreeRecursive(root, 0, num_of_nodes));
        //System.out.println("isbtreecomplete "+isCompleteBinaryTreeIterative(root));
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
    public static int treeSize(BinaryTreeNode root) {
        if(root==null)
            return 0;
        return(1+treeSize(root.getLeft())+treeSize(root.getRight()));
    }
    public static boolean isCompleteBinaryTreeRecursive(BinaryTreeNode root,int i,int num_of_nodes) {
        if(root==null)
            return true;
        if(i>=num_of_nodes)
            return false;
        return(isCompleteBinaryTreeRecursive(root.getLeft(), 2*i+1, num_of_nodes)&&isCompleteBinaryTreeRecursive(root.getRight(), 2*i+2, num_of_nodes));
    }
    public static boolean isCompleteBinaryTreeIterative(BinaryTreeNode root) {
        if(root==null)
            return true;
        BinaryTreeNode temp;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty()) {
            temp = q.remove();
            if(temp.getLeft()!=null) {
                if(flag==true)
                    return false;
                q.add(temp.getLeft());
            }else 
                flag = true;
            if(temp.getRight()!=null) {
                if(flag==true)
                    return false;
                q.add(temp.getLeft());
            }else 
                flag = true;
            
        }
        return true;
    }
    
}
