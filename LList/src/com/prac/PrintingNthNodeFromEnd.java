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
public class PrintingNthNodeFromEnd {
    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(3);
        l1.add("a");
        l1.add(0.24);
        l1.add("maya");
        l1.add(5);
        System.out.println("LinkedList is:: "+l1);
        printNthNodeFromEnd(l1.getHead(),6);
    }
    public static void printNthNodeFromEnd(LinkedList.Node head,int pos) {
        /*int lstlngth = l1.listLength();
        boolean valid_pos = false;
        if(pos>=1 && pos<= lstlngth)
            valid_pos=true;
        if(valid_pos) {*/
        LinkedList.Node first = head;
        LinkedList.Node second = head;
        int count = 1;
        while(count < pos) {
            first = first.getNext();
            count++;
        }
        while(first.getNext()!=null){
            first = first.getNext();
            second = second.getNext();
        }
        System.out.println(pos+"th Node from end of the list is:: "+second.getData());
        /*}
        else {
            System.out.println("invalid position entered.. position must be from"+1+"to"+lstlngth);
        }
        return "";*/
    }
}
