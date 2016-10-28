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
public class RevLList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(3);
        l1.add("a");
        l1.add(0.24);
        l1.add("maya");
        l1.add(5);
        System.out.println("LinkedList is:: "+l1);
        lListRevRecursive(l1,null,l1.getHead());
        System.out.println("rev of LinkedList is:: "+l1);
        reverseLinkedList(l1);
    }
    public static void reverseLinkedList(LinkedList l1) {
        LinkedList.Node previous = null;
        LinkedList.Node current = l1.getHead();
        LinkedList.Node next;
        while(current!=null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
            //next = next.getNext();
        }
        l1.setHead(previous);
        System.out.println("reverse of given Linked List is:: "+l1);
    }
    
    public static void lListRevRecursive(LinkedList l,LinkedList.Node prev, LinkedList.Node cur) {
        if(cur == null) {
            l.setHead(prev);
            return;
        }
        lListRevRecursive(l,cur, cur.getNext());
        cur.setNext(prev);
    }
    
}
