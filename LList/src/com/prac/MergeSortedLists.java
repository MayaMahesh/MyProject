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
public class MergeSortedLists {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(5);
        l1.add(7);
        l1.add(11);
        l1.add(19);
        l1.add(26);
        l1.add(28);
        l1.add(31);
        System.out.println("Given Linked List is::"+l1);
        LinkedList l2 = new LinkedList();
        l2.add(3);
        l2.add(6);
        l2.add(11);
        l2.add(17);
        l2.add(22);
        l2.add(24);
        l2.add(27);
        l2.add(30);
        l2.add(34);
        l2.add(36);
        l2.add(37);
        System.out.println("Given Linked List is::"+l2);
        LinkedList res1 = new LinkedList();
        res1.setHead(mergeSortedList(res1.getHead(),l1.getHead(),l2.getHead()));
        System.out.println("sorted Linked List is::"+res1);
    }
    public static LinkedList.Node mergeSortedList(LinkedList.Node res,LinkedList.Node a,LinkedList.Node b) {
        //LinkedList res = new LinkedList();
        
        if(a==null)
            return b;
        if(b==null)
            return a;
        if((int)a.getData() < (int)b.getData()) {
            res.setData(a.getData());
           mergeSortedList(res,a.getNext(), b);
        } else if((int)b.getData()<(int)a.getData()) {
            res.setData(b.getData());
            mergeSortedList(res,a, b.getNext());
        }
        return res;
    }
}
