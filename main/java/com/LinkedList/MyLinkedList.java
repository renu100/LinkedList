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

	public void display() {
		INode temp = head;
		while (temp != null) {
			System.out.print(temp.getKey() + "->");
			temp = temp.getNext();
		}
		System.out.print("null");
	}
}