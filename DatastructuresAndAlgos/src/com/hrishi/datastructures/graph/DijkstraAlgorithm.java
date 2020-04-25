package com.hrishi.datastructures.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.hrishi.datastructures.common.Edge;

public class DijkstraAlgorithm {

	/*
	 * Dijkstra Algorithm - single source shortest path
	 */
	
	static int vertices = 6;
	
	static int shortestPath = Integer.MAX_VALUE;
	
	static WeightedGraphUsingList graph = new WeightedGraphUsingList(vertices,true);
	
	static List<LinkedList<Edge>> adjList = graph.adjList;
	
	public static void main(String[] args) {
		
		graph.addEdge(0, 1, 2);
		graph.addEdge(0, 2, 4);
		graph.addEdge(1, 2, 1);
		graph.addEdge(1, 3, 7);
		graph.addEdge(2, 4, 3);
		graph.addEdge(3, 5, 1);
		graph.addEdge(4, 3, 2);
		graph.addEdge(4, 5, 5);
		
		int[] distance = new int[vertices];
		findShortestDistanace(0, 4, distance);
		System.out.println(shortestPath);
	}
	
	static void findShortestDistanace(int start, int end, int[] distance) {
		populateInitialDistances(start,distance);
		LinkedList<Edge> list = adjList.get(start);
		ListIterator<Edge> listIterator = list.listIterator();
		int leastWeight = Integer.MAX_VALUE;
		int leastWeightIndex = -1;
		while(listIterator.hasNext()) {
			Edge edge = listIterator.next();
			if(edge.destination == end) {
				if(distance[end] < shortestPath) {
					shortestPath = distance[end];
				}
			} else {
				if(edge.weight < leastWeight) {
					leastWeight = edge.weight;
					leastWeightIndex = edge.destination;
				}
			}
		}
		if(leastWeightIndex > -1) {
			findShortestDistanace(leastWeightIndex, end, distance);
		}
	}
	
	static void populateInitialDistances(int start, int[] distance) {
		LinkedList<Edge> list = adjList.get(start);
		ListIterator<Edge> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			Edge edge = listIterator.next();
			distance[edge.destination] = distance[edge.source] + edge.weight;
		}
	}
	
}
