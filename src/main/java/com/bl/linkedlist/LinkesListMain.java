package com.bl.linkedlist;

import java.util.Scanner;

public class LinkesListMain {
	public static void main(String[] args) {
		System.out.println("Welcome to DataStructure Program On LinkedList ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to add the data at the start");
		System.out.println("Enter 2 to add the data at the end");
		System.out.println("Enter 3 to insert data at the Middle");
		System.out.println("Enter 4 to delete data at the first");
		System.out.println("Enter 5 to delete data at the last");
		switch (scanner.nextInt()) {
		case 1:
			Operations.addeElementAtStart();
			break;
		case 2:
			Operations.addElementAtEnd();
			break;
		case 3:
			Operations.insertInBetween();
			break;
		case 4:
			Operations.deleteFirstNode();
			break;
		case 5:
			Operations.deleteLastNode();
			break;
		}
	}
}
