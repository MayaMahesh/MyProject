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
public class LinkedList {
    Node head;
    int listLength;
    
    public LinkedList () {
        head = new Node();
        listLength = 0;
    }
    public LinkedList(Object data) {
        head = new Node(data);
    }
    public void add(Object data) {
        Node nodeToInsert = new Node(data);
       /* if(head == null) {
            head = nodeToInsert;
        }*/
        if(head.getData() == null && head.getNext() == null) {
            head = nodeToInsert;
        }
        else {
            Node currentNode = head;
            while(currentNode.getNext()!=null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(nodeToInsert);
        }
    }
    public void add(Object data,int pos) {
        int listSize = listLength();
        int pos_limit = listSize+1;
        int count=1;
        if(pos<1 || pos>listSize+1)
            System.out.println("Invalid position entered. Position must be from"+1+"to"+ pos_limit);
        Node nodeToInsert = new Node(data);
        if(pos==1) {
            nodeToInsert.setNext(head);
            head = nodeToInsert;
        }
        if(pos>1 && pos<=listSize+1) {
        Node previousNode = head;
        while(count<pos-1)
        {
            previousNode = previousNode.getNext();
            count++;
        }
        Node currentNode = previousNode.getNext();
        previousNode.setNext(nodeToInsert);
        if(currentNode!=null) 
            nodeToInsert.setNext(currentNode);
        }
        
    }
    public void remove() {
        if(head == null) {
            System.out.println("List is empty");
        }
        Node currentNode = head;
        Node previousNode = null;
        if(currentNode.getNext()==null) {
            head = null;
        }
        else {
            while(currentNode.getNext()!=null) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            currentNode = null;
            previousNode.setNext(null);
        }
        
    }
    public Object printNthNodeFromEnd(int pos) {
        int lstlngth = listLength();
        boolean valid_pos = false;
        if(pos>=1 && pos<= lstlngth)
            valid_pos=true;
        if(valid_pos) {
            Node first = new Node();
        Node second = new Node();
        first = second = head;
        int count = 1;
        while(count < pos) {
            first = first.getNext();
            count++;
        }
        while(first.getNext()!=null){
            first = first.getNext();
            second = second.getNext();
        }
        return second.getData();
        }
        else {
            System.out.println("invalid position entered.. position must be from"+1+"to"+lstlngth);
        }
        return "";
    }
    public void remove(int pos) {
        int lstlngth = listLength();
        if(pos<1 || pos>lstlngth) {
            System.out.println("Invalid position entered. Position must be between"+1+"and"+lstlngth);
        }
        Node previousNode = head;
        int count = 1;
        if(pos==1) {
            head = head.getNext();
            previousNode = null;
        }
        else {
            while(count<pos-1) {
            previousNode = previousNode.getNext();
            count++;
        }
        Node currentNode = previousNode.getNext();
        if(currentNode.getNext()!=null) {
            previousNode.setNext(currentNode.getNext());
        }
        else {
            previousNode.setNext(null);
        }
        }
      }
    public int listLength() {
        if(head == null) {
            listLength =0;
        }
        else {
            int count = 1;
            Node currentNode = head;
            while(currentNode.getNext()!= null) {
                currentNode = currentNode.getNext();
                count++;
            }
            listLength = count;
        }
        return listLength;
    }
    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    public Object get(int pos) {
        int listSize = listLength();
        if(pos<1 || pos>listSize) {
            System.out.println("invalid position entered. position must be between"+1+"and"+listSize);
        }
        Node currentNode = head;
        int count=1;
        if(pos==1) {
            return head.getData();
        }
        else {
            while(count<pos){
                currentNode = currentNode.getNext();
                count++;
                }
        }
        return currentNode.getData();
    }
    @Override
    public String toString() {
    	Node current = head;
    	if(current.getData()==null && current.getNext()==null) {
    		return null;
    	}
    	String str = current.getData().toString();
    	while(current.getNext()!=null ) {
    		current = current.getNext();
    		str+="-->"+current.getData();
    	}
    	return str;
    }
    
    public class Node {
        Object data;
        Node next;
        
        public Node() {
            this.data = null;
            this.next = null;
        }
        
        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
        
        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
        
        public void setData(Object data) {
            this.data = data;
        }
        
        public Object getData() {
            return data;
        }
        
        public void setNext(Node next) {
            this.next = next;
        }
        public Node getNext() {
            return next;
        }
    }
    
}
