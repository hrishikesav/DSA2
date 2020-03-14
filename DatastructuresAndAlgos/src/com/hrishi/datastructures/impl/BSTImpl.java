package com.hrishi.datastructures.impl;

import com.hrishi.datastructures.tree.BST;

public class BSTImpl {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.add(bst.root, bst.createNode(10));
		bst.add(bst.root, bst.createNode(12));
		bst.add(bst.root, bst.createNode(11));
		bst.add(bst.root, bst.createNode(13));
		bst.add(bst.root, bst.createNode(6));
		
		bst.search(12, bst.root);
		bst.search(6,bst.root);
		bst.search(123,bst.root);
	}

}
