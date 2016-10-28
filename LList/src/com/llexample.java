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
public class llexample {
    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5, 3);
        l1.add(1.76, 5);
        System.out.println("LinkedList is:"+l1);
        l1.remove(5);
        System.out.println("LinkedList is:"+l1);
        System.out.println("LinkedList is:"+l1.get(4));
        l1.remove();
        System.out.println("LinkedList is:"+l1);
        //System.out.println("printing Nth Node from end::"+l1.printNthNodeFromEnd(3));
        System.out.println("LinkedList head::"+l1.getHead());
    }
    
}
