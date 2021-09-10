package com.bl.linkedlist;

public class Operations {
	public static LinkedList addeElementAtStart() {

		LinkedList linkedList = new LinkedList();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);

		linkedList.print();
		return linkedList;
	}

	public static void addElementAtEnd() {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
	}

	public static void insertInBetween() {

		LinkedList linkedList = new LinkedList();
		Node secondNode = linkedList.push(70);
		Node firstNode = linkedList.push(56);
		Node newNode = new Node(30);
		linkedList.print();
		linkedList.insertInBetween(firstNode, newNode);
		linkedList.print();
	}

	public static void deleteFirstNode() {

		LinkedList linkedList = addeElementAtStart();
		Node deletedNode = linkedList.pop();
		System.out.println("Delete Node is" + deletedNode.data);
		linkedList.print();
	}

}
