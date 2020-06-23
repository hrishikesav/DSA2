package com.hrishi.problems.tree.traversal;

import java.util.LinkedList;

import com.hrishi.datastructures.tree.BinaryTree;
import com.hrishi.datastructures.tree.Node;

/*
 * Dist(n1, n2) = Dist(root, n1) + Dist(root, n2) - 2*Dist(root, lca) 
 * 'n1' and 'n2' are the two given keys
 * 'root' is root of given Binary Tree.
 * 'lca' is lowest common ancestor of n1 and n2
 * Dist(n1, n2) is the distance between n1 and n2.
 * 
 */
public class DistanceBetweenTwoNodesBinaryTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(1);

		Node root = tree.getRootNode();

		root.left = new Node(2, null, null);
		root.right = new Node(3, null, null);

		root.left.left = new Node(4, null, null);
		root.left.right = new Node(5, null, null);

		root.right.left = new Node(6, null, null);
		root.right.right = new Node(7, null, null);

		int val1 = 4;
		int val2 = 6;

		int d1 = distanceToRoot(root, new Node(val1, null, null), 0);
		int d2 = distanceToRoot(root, new Node(val2, null, null), 0);
		
		int lca = findLCA(root,val1,val2);
		int dLca = distanceToRoot(root, new Node(lca, null, null), 0);
		
		System.out.println("Distance between = " + (d1+d2-2*dLca));

	}

	static int distanceToRoot(Node root, Node node, int count) {
		if (root != null) {
			if (root.value == node.value) {
				return count;
			} else {
				int lRet = distanceToRoot(root.left, node, count + 1);
				if (lRet != -1) {
					return lRet;
				}

				int rRet = distanceToRoot(root.right, node, count + 1);
				if (rRet != -1) {
					return rRet;
				}
			}
		}
		return -1;
	}

	static int findLCA(Node root, int val1, int val2) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(root.value);
		LinkedList<Integer> retList1 = pathToRoot(root, val1, list);
//	    retList1.stream().forEach(System.out::println);

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(root.value);
		LinkedList<Integer> retList2 = pathToRoot(root, val2, list2);
//	    retList2.stream().forEach(System.out::println);

		int prevVal = root.value;
		for (int i = 0; i < retList1.size(); i++) {
			int v1 = retList1.get(i);
			int v2 = retList2.get(i);

			if (v1 == v2) {
				prevVal = v1;
				continue;
			} else {
				break;
			}
		}
		return prevVal;
	}

	static LinkedList<Integer> pathToRoot(Node root, int val, LinkedList<Integer> list) {

		if (root.value == val) {
			return list;
		} else {
			if (root.left != null) {
				list.add(root.left.value);
				LinkedList<Integer> list1 = pathToRoot(root.left, val, list);
				if (list1.getLast() == val) {
					return list;
				} else {
					list.removeLast();
				}
			}

			if (root.right != null) {
				list.add(root.right.value);
				LinkedList<Integer> list2 = pathToRoot(root.right, val, list);
				if (list2.getLast() == val) {
					return list;
				} else {
					list.removeLast();
				}
			}
		}
		return list;
	}

}
