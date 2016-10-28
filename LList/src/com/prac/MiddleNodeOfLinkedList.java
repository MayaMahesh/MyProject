/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prac;

import com.LinkedList;

/**
 *
 * @author j1016767
 */
public class MiddleNodeOfLinkedList {
    public static void main(String[] args) {
        LinkedList.Node MiddleNode = null;
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        System.out.println("Given Linked List is::"+l1);
        MiddleNode = ListMiddleNode(l1);
        System.out.println("Middle Node of the LinkedList is:: "+MiddleNode.getData());
    }
    public static LinkedList.Node ListMiddleNode(LinkedList l1) {
        LinkedList.Node slow = l1.getHead();
        LinkedList.Node fast = l1.getHead();
        while(slow.getNext()!=null && fast.getNext()!=null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
    
}
