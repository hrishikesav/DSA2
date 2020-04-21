package com.hrishi.problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.hrishi.datastructures.tree.BinaryTree;
import com.hrishi.datastructures.tree.Node;

public class InOrderTreeNodes {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(314);
		
		Node root = tree.getRootNode();
		
		root.left = new Node(6, null, null);
		root.right = new Node(8, null, null);
		
		root.left.left = new Node(271, null, null);
		root.left.right = new Node(561, null, null);
		
		root.right.left = new Node(2, null, null);
		root.right.right = new Node(272, null, null);
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(root.value);
		queue.offer(root.left.value);
		queue.offer(root.right.value);
		queue.offer(root.left.left.value);
		queue.offer(root.left.right.value);
		queue.offer(root.right.left.value);
		queue.offer(root.right.right.value);
		
		Integer val = null;
		while((val = queue.poll()) != null) {
			System.out.print(val + " ");
		}
		
	}

}
