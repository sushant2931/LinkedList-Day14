package com.bl.linkedlist;

import java.util.Scanner;

public class LinkesListMain {
	public static void main(String[] args) {
		System.out.println("Welcome to DataStructure Program On LinkedList ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to add the data at the start");
		System.out.println("Enter 2 to add the data at the end");
		System.out.println("Enter 3 to insert data at the Middle");
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

		}
	}
}
