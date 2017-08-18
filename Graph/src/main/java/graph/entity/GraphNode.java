package graph.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will hold the graph node aka vertex data.
 * 
 */
public class GraphNode 
{
	private int nodeData;
	private List<GraphNode> neighbours;
	private boolean visited;
	
	public GraphNode(int nodeData)
	{
		this.nodeData = nodeData;
		this.neighbours = new ArrayList<GraphNode>();
	}
	
	public int getNodeData() 
	{
		return this.nodeData;
	}
	
	public List<GraphNode> getNeighbours() 
	{
		return this.neighbours;
	}
	
	public void setVisited(boolean isVisited)
	{
		this.visited = isVisited;
	}
	
	public boolean isVisited()
	{
		return this.visited;
	}
}

