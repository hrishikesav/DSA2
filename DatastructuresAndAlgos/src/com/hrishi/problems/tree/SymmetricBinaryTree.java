package com.hrishi.problems.tree;

import com.hrishi.datastructures.tree.BinaryTree;
import com.hrishi.datastructures.tree.Node;

public class SymmetricBinaryTree {

	public static void main(String[] args) {

BinaryTree tree = new BinaryTree(314);
		
		Node root = tree.getRootNode();
		
		root.left = new Node(6, null, null);
		root.right = new Node(6, null, null);
		
		root.left.right = new Node(2, null, null);
		root.right.left = new Node(2, null, null);
		
		root.left.right.right = new Node(3, null, null);
		root.right.left.left = new Node(3, null, null);
		
		System.out.println(isSymmetric(root));
		
	}
	
	static boolean isSymmetric(Node node) {
		
		return node == null || checkSymmetric(node.left, node.right);
		
	}
	
	static boolean checkSymmetric(Node left, Node right) {
		if(left == null && right == null) {
			return true;
		} else if(left != null && right != null) {
			return left.value == right.value &&
					checkSymmetric(left.right, right.left) &&
					checkSymmetric(left.left, right.right);
		} 
		
		return false;
	}

}
