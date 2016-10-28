/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prac;

import com.LinkedList;
import java.util.*;

/**
 *
 * @author j1016767
 */
public class IntersectionOfTwoLList {
    public static void main(String[] args) {
        LinkedList.Node intersectingNode;
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        //System.out.println("Given Linked List is::"+l1);
        LinkedList l2 = new LinkedList();
        l2.add("a");
        l2.add("b");
        l2.add("5");
        createIntersectingLists(l1, l2);
        //intersectingNode = getIntersectingNode(l1, l2);
        intersectingNode = detectIntersectingNode(l1, l2);
        if(intersectingNode!=null) {
            System.out.println("Intersecting Node is:: "+intersectingNode.getData());
        } else {
            System.out.println("Intersecting Node is null");
        }
        
    }
    public static void createIntersectingLists(LinkedList l1,LinkedList l2) {
        LinkedList.Node current = l2.getHead();
        while(current.getNext()!=null) {
            current = current.getNext();
        }
        current.setNext(getRandomNode(l1));
        System.out.println("list 1: "+l1);
        System.out.println("list 2: "+l2);
    }
    public static LinkedList.Node getRandomNode(LinkedList l1) {
        LinkedList.Node Current = l1.getHead();
        int count=1;
        if(l1.listLength()>2) {     /*hardcoded code by default making the third node as random node always need to be reviewed */
             while(count<2) {
            Current=Current.getNext();
            count++;
        }
        } else {
            System.out.println("invalid list size");
        }
       
        return Current;
    }
    public static LinkedList.Node getIntersectingNode(LinkedList l1,LinkedList l2) {
        int list1_length = l1.listLength();
        int list2_length = l2.listLength();
        int diff_in_listlengths;
        if(list1_length > list2_length) {
            diff_in_listlengths = list1_length - list2_length;
            return get_Intersecting_Node(diff_in_listlengths, l1, l2);
        } else {
            diff_in_listlengths = list2_length - list1_length;
            return get_Intersecting_Node(diff_in_listlengths, l2, l1);
        }
        //return null;
    }
    public static LinkedList.Node get_Intersecting_Node(int d,LinkedList l1,LinkedList l2) {
        LinkedList.Node l1pointer = l1.getHead();
        LinkedList.Node l2pointer = l2.getHead();
        int count = 1;
        while(count<=d) {
            l1pointer = l1pointer.getNext();
            count++;
        }
        while(l1pointer.getNext()!=null && l2pointer.getNext()!=null) {
            l1pointer = l1pointer.getNext();
            l2pointer = l2pointer.getNext();//improper logic please check however it works now
            if(l1pointer.getNext()==l2pointer.getNext()) {
                return l1pointer;
            }
        }
        return null;
    }
    public static LinkedList.Node detectIntersectingNode (LinkedList l1,LinkedList l2) {
        HashMap<Integer,LinkedList.Node> hm = new HashMap<Integer,LinkedList.Node>();
        LinkedList.Node current = l1.getHead();
        LinkedList.Node current1 = l2.getHead();
        int count = 1;
        while(current!=null) {
            hm.put(count, current);
            current = current.getNext();
            count++;
        }
        while(current1.getNext()!=null) {
            if(hm.containsValue(current1)) {
                return current1;
            } else {
                      current1 = current1.getNext();
            }
            
        }
        return null;
    }
}
