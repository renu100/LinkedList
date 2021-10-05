package com.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumbersWhenLinkedShouldBeAddedToTop() {
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secoundNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addNode(firstNode);;
		myLinkedList.addNode(secoundNode);
		myLinkedList.addNode(thirdNode);
		System.out.println("addNode");
		myLinkedList.display();
		boolean result = myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secoundNode)
				&& myLinkedList.tail.equals(firstNode);
		assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenLinkedShouldBeAddedToLast() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secoundNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.appendNode(firstNode);
		myLinkedList.appendNode(secoundNode);
		myLinkedList.appendNode(thirdNode);
		System.out.println("appendNode");
		myLinkedList.display();
		boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secoundNode)
				&& myLinkedList.tail.equals(thirdNode);
		assertEquals(true, result);
	}

	@Test
	public void insetBetween() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secoundNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertBetween(firstNode, secoundNode);
		System.out.println("insertBetween");
		myLinkedList.display();
		boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secoundNode)
				&& myLinkedList.tail.equals(thirdNode);
		assertEquals(true, result);
	}

}