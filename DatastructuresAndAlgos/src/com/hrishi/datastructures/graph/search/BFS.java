package com.hrishi.datastructures.graph.search;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

import com.hrishi.datastructures.graph.GraphUsingLists;

public class BFS {

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
		
		int start = 2;
		BFS(start);
	}
	
	static void BFS(int start) { 
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(start);
		visited[start] = true;
		
		while(queue.size() > 0) {
			int n = queue.poll();
			System.out.print(n + " ");
			LinkedList<Integer> list = adjList.get(n);
			ListIterator<Integer> listIterator = list.listIterator();
			while(listIterator.hasNext()) {
				int num = listIterator.next();
				if(!visited[num]) {
					queue.add(num);
					visited[num] = true;
				}
			}
		}
		
	}

}
