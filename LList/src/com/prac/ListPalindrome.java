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
public class ListPalindrome {
    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        boolean listPalindrome;
        l1.add("m");
        l1.add("a");
        l1.add("d");
        l1.add("d");
        l1.add("a");
        l1.add("m");
        System.out.println("Given Linkedlist::"+l1);
        listPalindrome = isListPalindrome(l1);
        System.out.println("is the given list palindrome::"+listPalindrome);
    }
    public static boolean isListPalindrome(LinkedList l1) {
        Stack s1 = new Stack();
        LinkedList.Node current = l1.getHead();
        LinkedList.Node current1 = l1.getHead();
        LinkedList.Node poppedNode;
        while(current!=null) {
            s1.push(current);
            current = current.getNext();
        }
        while(current1!=null) {
            poppedNode = (LinkedList.Node)s1.pop();
            if(poppedNode.getData()==current1.getData()) {
               current1 = current1.getNext();
            } else {
                return false;
            }
        }
        return true;
    }
}
