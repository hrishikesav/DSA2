package com.hrishi.datastructures.tree;

public class BinaryTree {
	
	Node root = null;
	
	public BinaryTree(int key) {
		super();
		this.root = new Node(key, null, null);
	}
	
	public Node getRootNode() {
		return this.root;
	}
}
