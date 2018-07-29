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
public class BinaryTreeNode {
    private Object data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    
    public BinaryTreeNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }
    public BinaryTreeNode(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public BinaryTreeNode(Object data,BinaryTreeNode left,BinaryTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public Object getData() {
        return data;
    }
    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }
    public BinaryTreeNode getLeft() {
        return left;
    }
    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
    public BinaryTreeNode getRight() {
        return right;
    }
}
