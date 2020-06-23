package com.hrishi.problems.tree.traversal;

import com.hrishi.datastructures.tree.BinaryTree;
import com.hrishi.datastructures.tree.Node;

public class DistanceToRootBinaryTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(1);

		Node root = tree.getRootNode();

		root.left = new Node(2, null, null);
		root.right = new Node(3, null, null);

		root.left.left = new Node(4, null, null);
		root.left.right = new Node(5, null, null);

		root.right.left = new Node(6, null, null);
		root.right.right = new Node(7, null, null);

		System.out.println("Distance to root: " + distanceToRoot(root, new Node(7,null,null), 0));

	}

	static int distanceToRoot(Node root,Node node, int count) {
	    if(root != null) {
	      if(root.value == node.value) {
	        return count;
	      } else {
	        int lRet = distanceToRoot(root.left,node,count+1);
	        if(lRet != -1) {
	          return lRet;
	        }
	        
	        int rRet = distanceToRoot(root.right,node,count+1);
	        if(rRet != -1) {
	          return rRet;
	        }
	      }
	    }
	    return -1;
	  }
}
