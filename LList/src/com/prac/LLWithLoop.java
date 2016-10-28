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
public class LLWithLoop {
    public static void main(String args[]) {
        boolean doesLoopExist = false;
        int looplength;
        LinkedList.Node startOfLoop = null;
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        System.out.println("Given Linked List is::"+l1);
        createLoop(l1);
       //System.out.println("Linked List with Loop::"+l1);/*printing a list with node doesnt work dats y commented */
        doesLoopExist = detectLoop(l1);
        System.out.println("does_loop_exists:: "+ doesLoopExist);
        startOfLoop = detectStartOfLoop(l1);
        System.out.println("start of the loop in given linked list is "+ startOfLoop.getData());
        /*if(startOfLoop!=null) {
            System.out.println("start of the loop in given linked list is "+ startOfLoop.getData());
        }*/
        looplength = lengthOfLinkedList(l1);
        System.out.println("LoopLength is::"+looplength);
    }
    public static void createLoop(LinkedList l1) {
       LinkedList.Node Current = l1.getHead();
       while(Current.getNext()!=null) {
           Current = Current.getNext();/* traversing the list till the end(ie; till last node) */
       }
       Current.setNext(getRandomNode(l1)); /*setting next of the last node to some random node of the same list there by making a loop */
    }
    public static LinkedList.Node getRandomNode(LinkedList l1) {
        LinkedList.Node Current = l1.getHead();
        int count=1;
        if(l1.listLength()>4) {     /*hardcoded code by default making the third node as random node always need to be reviewed */
             while(count<4) {
            Current=Current.getNext();
            count++;
        }
        } else {
            System.out.println("invalid list size");
        }
       
        return Current;
    }
    public static boolean detectLoop(LinkedList l1) {
        LinkedList.Node slow = l1.getHead(); /*setting slow n fast pointer to head */
        LinkedList.Node fast = l1.getHead();
        while(slow.getNext()!=null && fast.getNext()!=null) {
            slow = slow.getNext();           /* moving slow pointer by one position and fast by two positions*/
            fast = fast.getNext().getNext();
            if(slow==fast) { /*if a loop exists den moving slow by one n fast by two positions each time makes sure dat dey definitly meet at some point */
                return true;    
            }
        }
        return false;
    }
    public static LinkedList.Node detectStartOfLoop(LinkedList l1) { /*extension of detectLoop */
        LinkedList.Node slow = l1.getHead(); /*setting slow n fast pointer to head */
        LinkedList.Node fast = l1.getHead();
        //LinkedList.Node loopNode = null;
        while(slow.getNext()!=null && fast.getNext()!=null) {
            slow = slow.getNext();           /* moving slow pointer by one position and fast by two positions*/
            fast = fast.getNext().getNext();
            if(slow==fast) { /*if a loop exists den moving slow by one n fast by two positions each time makes sure dat dey definitly meet at some point */
                slow = l1.getHead();
                //loopNode = fast;
                break;
            }
        }
        while(slow.getNext()!=null && fast.getNext()!=null) {
            slow = slow.getNext();
            fast = fast.getNext();
            if(slow==fast) {
                return slow; /*start of the loop */
            }
        }
        return null;
    }
    public static int lengthOfLinkedList(LinkedList l1) {
        LinkedList.Node slow = l1.getHead();
        LinkedList.Node fast = l1.getHead();
        boolean loopexists = false;
        int count = 0;
        while(slow.getNext()!=null && fast.getNext()!=null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow==fast) {
                loopexists = true;
                break;        
            }
        }
        if(loopexists) {
            while(fast.getNext()!=null) {
                fast = fast.getNext();
                count++;
                if(slow==fast) {
                    return count;
                }
            }
        } else {
            System.out.println("List doesnt contain any loop");
        }
        
        return 0;
    }
}
