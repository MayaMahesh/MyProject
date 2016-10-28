/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prac;

/**
 *
 * @author j1016767
 */
public class ListNode {
    Object data;
    ListNode next;
    
    public ListNode() {
        this.data = null;
        this.next = null;
    }
    
    public ListNode(Object data) {
        this.data = data;
        this.next = null;
    }
    
    public ListNode(Object data,ListNode next) {
        this.data = data;
        this.next = next;
    }
    public Object getaData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    
    
    public String toString() {
        String str = "";
        str += this.data.toString();
        return str;
    }
    
}
