package com.hrishi.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {

	T data;
	Tree<T> parent = null;
	List<Tree<T>> children = new ArrayList<Tree<T>>();
	
	public Tree(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void addChild(Tree<T> child) {
		this.children.add(child);
		child.parent = this;
	}
	
	public boolean isRoot() {
		return (this.parent == null);
	}
	
	public boolean isLeaf() {
		return (this.children.size() == 0);
	}
	
	public List<Tree<T>> getChildren() {
		return this.children;
	}
}
