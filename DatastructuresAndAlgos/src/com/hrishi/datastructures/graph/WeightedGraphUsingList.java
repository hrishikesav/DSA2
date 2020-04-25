package com.hrishi.datastructures.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.hrishi.datastructures.common.Edge;

public class WeightedGraphUsingList {

	int vertices;
			
	boolean directed = false;
	
	public List<LinkedList<Edge>> adjList = new ArrayList<LinkedList<Edge>>();
	
	public WeightedGraphUsingList(int vertices, boolean directed) {
		this.directed = directed;
		this.vertices = vertices;
		for(int i=0; i<vertices; i++) {
			adjList.add(new LinkedList<Edge>());
		}
	}
	
	public void addEdge(int i, int j, int weight) {
		Edge edge = new Edge(i, j, weight);
		if(directed) {
			adjList.get(i).addLast(edge);
		} else {
			adjList.get(i).addLast(edge);
			adjList.get(j).addLast(edge);
		}
	}
}
