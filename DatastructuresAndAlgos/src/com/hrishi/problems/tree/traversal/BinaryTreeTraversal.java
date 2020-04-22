package com.hrishi.problems.tree.traversal;

import com.hrishi.datastructures.tree.BinaryTree;
import com.hrishi.datastructures.tree.Node;

public class BinaryTreeTraversal {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(314);
		
		Node root = tree.getRootNode();
		
		root.left = new Node(6, null, null);
		root.right = new Node(8, null, null);
		
		root.left.left = new Node(271, null, null);
		root.left.right = new Node(561, null, null);
		
		root.right.left = new Node(2, null, null);
		root.right.right = new Node(272, null, null);
		
		inOrderTraversal(root);
		
		System.out.println();
		
		preOrderTraversal(root);
		
		System.out.println();
		
		postOrderTraversal(root);
		
	}
	
	static void inOrderTraversal(Node node) {
		if(node.left != null) {
			inOrderTraversal(node.left);
		}
		
		System.out.print(node.value + " ");
		
		if(node.right != null) {
			inOrderTraversal(node.right);
		}
	}
	
	static void preOrderTraversal(Node node) {
		System.out.print(node.value + " ");
		
		if(node.left != null) {
			preOrderTraversal(node.left);
		}
		
		if(node.right != null) {
			preOrderTraversal(node.right);
		}
	}
	
	static void postOrderTraversal(Node node) {
		if(node.left != null) {
			postOrderTraversal(node.left);
		}
		
		if(node.right != null) {
			postOrderTraversal(node.right);
		}
		
		System.out.print(node.value + " ");
	}

}
