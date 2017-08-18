package graph.main;

import graph.entity.Graph;
import graph.entity.GraphEdge;
import graph.entity.GraphNode;
import graph.printer.GraphPrinter;
import graph.traverser.AdjacencyListTraverser;
import graph.traverser.BFSTraverser;
import graph.traverser.DFSTraverser;
import graph.traverser.GenericGraphTraverser;

public class GraphSimulator
{
	public static void main(String[] args) 
	{
		Graph graph = new Graph();
		GraphPrinter graphPrinter = new GraphPrinter();
		GenericGraphTraverser graphTraverser = 
			new GenericGraphTraverser(
				graph,
				new BFSTraverser(graphPrinter),
				graphPrinter);

		// Create the nodes
		GraphNode nodeOne = new GraphNode(1);
		GraphNode nodeTwo = new GraphNode(2);
		GraphNode nodeThree = new GraphNode(3);
		GraphNode nodeFour = new GraphNode(4);
		GraphNode nodeFive = new GraphNode(5);
		GraphNode nodeSix = new GraphNode(6);

		// Add the nodes
		graph.addNode(nodeOne);
		graph.addNode(nodeTwo);
		graph.addNode(nodeThree);
		graph.addNode(nodeFour);
		graph.addNode(nodeFive);
		graph.addNode(nodeSix);

		// Create an edge between nodes.
		GraphEdge edgeOne = new GraphEdge(nodeOne, nodeTwo);
		GraphEdge edgeTwo = new GraphEdge(nodeOne, nodeThree);
		GraphEdge edgeThree = new GraphEdge(nodeTwo, nodeFour);
		GraphEdge edgeFour = new GraphEdge(nodeTwo, nodeFive);
		GraphEdge edgeFive = new GraphEdge(nodeThree, nodeSix);

		// Add edges to the graph
		graph.addEdge(edgeOne);
		graph.addEdge(edgeTwo);
		graph.addEdge(edgeThree);
		graph.addEdge(edgeFour);
		graph.addEdge(edgeFive);

		// Display the BFS of graph
		graphTraverser.traverseGraphAndPrint();
		
		graphTraverser.setTraverser(
			new AdjacencyListTraverser(graphPrinter));

		// Display the adjacency List representation of graph
		graphTraverser.traverseGraphAndPrint();
		
		graphTraverser.setTraverser(
			new DFSTraverser(graphPrinter));
		
		graphTraverser.traverseGraphAndPrint();
	}
}
