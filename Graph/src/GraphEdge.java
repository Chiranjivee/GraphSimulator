public class GraphEdge
{
	GraphNode sourceNode;
	GraphNode destinationNode;
	
	public GraphEdge(GraphNode sourceNode, GraphNode destinationNode)
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
