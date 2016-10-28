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
public class BinarySearchTreeNode {
    private Object data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;
    
    public BinarySearchTreeNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }
    public BinarySearchTreeNode(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public BinarySearchTreeNode(Object data,BinarySearchTreeNode left,BinarySearchTreeNode right) {
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
    public void setLeft(BinarySearchTreeNode left) {
        this.left = left;
    }
    public BinarySearchTreeNode getLeft() {
        return left;
    }
    public void setRight(BinarySearchTreeNode right) {
        this.right = right;
    }
    public BinarySearchTreeNode getRight() {
        return right;
    }
}
