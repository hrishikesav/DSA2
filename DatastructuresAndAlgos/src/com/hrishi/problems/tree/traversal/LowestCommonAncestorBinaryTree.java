package com.hrishi.problems.tree.traversal;

import java.util.LinkedList;

import com.hrishi.datastructures.tree.BinaryTree;
import com.hrishi.datastructures.tree.Node;

public class LowestCommonAncestorBinaryTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(1);
	    
	    Node root = tree.getRootNode();
	    
	    root.left = new Node(2, null, null);
	    root.right = new Node(3, null, null);
	    
	    root.left.left = new Node(4, null, null);
	    root.left.right = new Node(5, null, null);
	    
	    root.right.left = new Node(6, null, null);
	    root.right.right = new Node(7, null, null);
	    
	    System.out.println("LCA is: " + findLCA(root,2,3)); 
	}
	
	static int findLCA(Node root, int val1, int val2) {
		LinkedList<Integer> list = new LinkedList<Integer>();
	    list.add(root.value);
	    LinkedList<Integer> retList1 = pathToRoot(root, val1, list );
//	    retList1.stream().forEach(System.out::println);
	    
	    LinkedList<Integer> list2 = new LinkedList<Integer>();
	    list2.add(root.value);
	    LinkedList<Integer> retList2 = pathToRoot(root, val2, list2 );
//	    retList2.stream().forEach(System.out::println);
	    
	    int prevVal = root.value;
	    for(int i=0; i<retList1.size(); i++) {
	    	int v1 = retList1.get(i);
	    	int v2 = retList2.get(i);
	    	
	    	if(v1 == v2) {
	    		prevVal = v1;
	    		continue;
	    	} else {
	    		break;
	    	}
	    }
	    return prevVal;
	}
	
	static LinkedList<Integer> pathToRoot(Node root, int val, LinkedList<Integer> list) {
		
		if(root.value == val) {
			return list;
		}else {
			if(root.left != null) {
				list.add(root.left.value);
				LinkedList<Integer> list1 = pathToRoot(root.left,val,list);
				if(list1.getLast() == val) {
					return list;
				} else {
					list.removeLast();
				}
			}
			
			if(root.right != null) {
				list.add(root.right.value);
				LinkedList<Integer> list2 = pathToRoot(root.right,val,list);
				if(list2.getLast() == val) {
					return list;
				} else {
					list.removeLast();
				}
			}
		}
		return list;
	}

}
