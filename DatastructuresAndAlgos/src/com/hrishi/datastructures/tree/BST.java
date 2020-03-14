package com.hrishi.datastructures.tree;

public class BST {

	public Node root;
	public BST() {
		root = null;
	}
	
	public Node createNode(int value) {
		return new Node(value, null, null);
	}
	
	public void add(Node start, Node newNode) {
		if(root == null) {
			root = newNode;
		} else if(newNode.value > start.value) {
			if(start.right == null) {
				start.right = newNode;
			}
			add(start.right,newNode);
		} else if(newNode.value < start.value) {
			if(start.left == null) {
				start.left = newNode;
			}
			add(start.left,newNode);
		}
	}
	
	public void search(int value, Node start) {
		if(start != null) {
			if(start.value == value) {
				System.out.println("Found value: " + value);
			} else if(value < start.value) {
				search(value, start.left);
			} else if(value > start.value) {
				search(value, start.right);
			}
		} else {
			System.out.println("Value not found.");
		}
	}

}
