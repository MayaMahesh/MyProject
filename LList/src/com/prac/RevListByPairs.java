/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prac;

import com.LinkedList;
import static com.prac.RevLList.reverseLinkedList;

/**
 *
 * @author j1016767
 */
public class RevListByPairs {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(3);
        l1.add("a");
        l1.add(0.24);
        l1.add("maya");
        l1.add(5);
        l1.add(0.09);
        System.out.println("LinkedList is:: "+l1);
        LinkedList l2 = new LinkedList();
        l2.setHead(revByPairs(l1.getHead()));
        System.out.println(l2);
    }
    public static LinkedList.Node revByPairs(LinkedList.Node head) {
        LinkedList.Node temp,temp2;
        if(head==null || head.getNext()==null)
            return head;
        temp = head.getNext(); temp2 = temp.getNext();
        temp.setNext(head);
        head.setNext(revByPairs(temp2));
        return temp;
    }
}
