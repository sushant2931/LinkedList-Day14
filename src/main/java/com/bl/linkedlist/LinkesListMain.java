package com.bl.linkedlist;

public class LinkesListMain {
	public static void main( String[] args )
    {
        System.out.println( "Welcome to DataStructure Program On LinkedList " );
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        Node tail = thirdNode;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
