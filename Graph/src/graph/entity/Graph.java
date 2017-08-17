package graph.entity;

import graph.entity.GraphEdge;
import graph.entity.GraphNode;
import graph.traverser.GraphTraverser;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will be responsible to hold the graph entity.
 */
public class Graph
{
	private List<GraphNode> nodeList;
	private List<GraphEdge> edgeList;
	
	public Graph()
	{
		this.nodeList = new ArrayList<GraphNode>();
		this.edgeList = new ArrayList<GraphEdge>();
	}
	
	public List<GraphNode> getNodes()
	{
		return this.nodeList;
	}

	public List<GraphEdge> getEdges()
	{
		return this.edgeList;
	}
	
	public void addNode(GraphNode node)
	{
		this.nodeList.add(node);
	}
	
	public void addEdge(GraphEdge edge)
	{
		this.edgeList.add(edge);
	}
}