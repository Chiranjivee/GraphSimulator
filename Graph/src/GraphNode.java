import java.util.ArrayList;
import java.util.List;

public class GraphNode 
{
	private int nodeData;
	private List<GraphNode> neighbours;
	
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
}

