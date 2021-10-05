package com.LinkedList;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public void addNode(INode<K> newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			INode temp = head;
			head = newNode;
			newNode.setNext(temp);
		}
	}

	public void appendNode(INode newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void insertBetween(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public void pop() {
		INode tempNode = head;
		head = head.getNext();
	}

	public void display() {
		INode temp = head;
		while (temp != null) {
			System.out.print(temp.getKey() + "->");
			temp = temp.getNext();
		}
		System.out.print("null");
	}
}