package com.LinkedList;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

class MyLinkedListTest {

	@Test
	public void addNode() {
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secoundNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addNode(firstNode);
		System.out.println("addNode");
		myLinkedList.display();
		boolean result = myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secoundNode)
				&& myLinkedList.tail.equals(firstNode);
		assertTrue(result);
	}

}