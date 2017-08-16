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
		nodeList = new ArrayList<GraphNode>();
		edgeList = new ArrayList<GraphEdge>();
	}
	
	public void addNode(GraphNode node)
	{
		this.nodeList.add(node);
	}
	
	public void addEdge(GraphEdge edge)
	{
		this.edgeList.add(edge);
	}
	
	public void displayGraph()
	{
		System.out.println("Display all the neighbours of all then nodes");
		StringBuilder graphOutput = new StringBuilder();
		for (GraphNode node: nodeList)
		{
			graphOutput.append(node.getNodeData());
			if (node.getNeighbours().size() == 0)
			{
				graphOutput.append(" => X");
				graphOutput.append("\n");
				continue;
			}

			List<GraphNode> neighbours = node.getNeighbours();
			for(GraphNode neighbour: neighbours)
			{
				graphOutput.append(" => " + neighbour.getNodeData());
			}

			graphOutput.append(" => X");
			graphOutput.append("\n");
		}

		System.out.println(graphOutput);
	}
}