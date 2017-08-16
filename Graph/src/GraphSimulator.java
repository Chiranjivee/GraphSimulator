public class GraphSimulator
{
	public static void main(String[] args) 
	{
		Graph graph = new Graph();
		
		// Create the nodes
		GraphNode nodeOne = new GraphNode(1);
		GraphNode nodeTwo = new GraphNode(2);
		GraphNode nodeThree = new GraphNode(3);
		
		// Add the nodes
		graph.addNode(nodeOne);
		graph.addNode(nodeTwo);
		graph.addNode(nodeThree);
		
		// Create an edge between nodes.
		GraphEdge edgeOne = new GraphEdge(nodeOne, nodeTwo);
		graph.addEdge(edgeOne);
		
		// Display the graph
		graph.displayGraph();
	}
}
