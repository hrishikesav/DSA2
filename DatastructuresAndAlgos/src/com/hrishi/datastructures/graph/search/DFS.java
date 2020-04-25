package com.hrishi.datastructures.graph.search;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.hrishi.datastructures.graph.GraphUsingLists;

public class DFS {
	
	static int vertices = 4;
	
	static GraphUsingLists graph = new GraphUsingLists(vertices,false);
	
	static boolean visited[] = new boolean[vertices];
	
	static List<LinkedList<Integer>> adjList = graph.adjList;
	
	public static void main(String[] args) {
		
		graph.addEdge(0, 1); 
		graph.addEdge(0, 2); 
		graph.addEdge(1, 2); 
		graph.addEdge(2, 0); 
		graph.addEdge(2, 3); 
		graph.addEdge(3, 3);
		
//		graph.addEdge(0, 1);
//		graph.addEdge(0, 3);
//		graph.addEdge(1, 3);
//		graph.addEdge(1, 2);
//		graph.addEdge(1, 6);
//		graph.addEdge(1, 5);
//		graph.addEdge(5, 2);
//		graph.addEdge(2, 3);
//		graph.addEdge(2, 4);
//		graph.addEdge(6, 4);
//		graph.addEdge(4, 3);
		
		int root = 2;
		System.out.println("DFS strating from root node - " + root);
		visited[2] = true;
		printAllNodes(root);
		
	}
	
	static void printAllNodes(int num) {
		visited[num] = true;
		System.out.print(num + " ");
		ListIterator<Integer> listIterator = adjList.get(num).listIterator();
		while(listIterator.hasNext()) {
			int n = listIterator.next();
			if(!visited[n]) {
				printAllNodes(n);
			}
		}
	}

}
