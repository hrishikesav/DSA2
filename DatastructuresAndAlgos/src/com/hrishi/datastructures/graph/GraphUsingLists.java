package com.hrishi.datastructures.graph;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class GraphUsingLists {
	
	private int vertices;
	boolean directed = false;
	public List<LinkedList<Integer>> adjList = new ArrayList<>();
	
	public GraphUsingLists(int vertices) {
		this(vertices,false);
	}
	
	public GraphUsingLists(int vertices, boolean directed) {
		this.directed = directed;
		this.vertices = vertices;
		for(int i=0; i<vertices; i++) {
			adjList.add(new LinkedList<Integer>());
		}
	}
	
	public void addEdge(int source, int destination) {
		if(directed) {
			if(source >= 0 && source < vertices && destination >=0 && destination < vertices) {
				adjList.get(source).addLast(destination);
			}
		} else {
			if(source >= 0 && source < vertices && destination >=0 && destination < vertices) {
				adjList.get(source).addLast(destination);
				adjList.get(destination).addLast(source);
			}
		}
	}
	
	public void printGraph() {
		for(int i=0; i<vertices; i++) {
			System.out.print("\"" + i + "\"");
			LinkedList<Integer> list = adjList.get(i);
			int size = list.size();
			for(int j=0; j<size; j++) {
				System.out.print(" -> " + list.get(j));
			}
			System.out.println();
		}
	}

}
