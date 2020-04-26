package com.hrishi.datastructures.impl;

import com.hrishi.datastructures.tree.Tree;

public class TreeImpl {

	public static void main(String[] args) {
		
		Tree<Character> tree = new Tree<Character>('a');
		tree.addChild(new Tree<Character>('b'));
		tree.addChild(new Tree<Character>('c'));
	}

}
