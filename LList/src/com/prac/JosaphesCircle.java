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
public class JosaphesCircle {
    public static void main(String[] args) {
        int n=10,m=3;
        JosaphesCircle(n, m);
    }

    public static void JosaphesCircle(int n, int m) {
        if(n!=0) {
            ListNode p = new ListNode(1);
            ListNode q;
            q=p;
            for(int i=2;i<=n;i++) {
                ListNode newnode = new ListNode(i);
                p.setNext(newnode);
                p = p.getNext();
            }
            p.setNext(q);
            while(q != null) {
                System.out.println(p.toString());
                q=q.getNext();
            }
            //System.out.println(p.toString());
        }
    }
}
    

