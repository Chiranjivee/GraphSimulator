package graph.entity;

/**
 * This class will represent an edge between two graph nodes
 * Right now the edge is an undirected edge
 * 
 */
public class GraphEdge
{
	private GraphNode sourceNode;
	private GraphNode destinationNode;
	
	public 
		GraphEdge(
			GraphNode sourceNode, 
			GraphNode destinationNode)
	{
		this.sourceNode = sourceNode;
		this.destinationNode = destinationNode;
		updateNeighbours();
	}

	public void updateNeighbours()
	{
		sourceNode.getNeighbours().add(destinationNode);
		destinationNode.getNeighbours().add(sourceNode);
	}
}
