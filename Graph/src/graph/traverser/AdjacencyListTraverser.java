package graph.traverser;

import graph.entity.Graph;
import graph.entity.GraphNode;
import graph.helper.TraversalHelper;
import graph.printer.GraphPrinter;

import java.util.List;

public class AdjacencyListTraverser implements GraphTraverser
{
	private TraversalHelper traversalHelper;
	private GraphPrinter printer;

	public AdjacencyListTraverser(GraphPrinter printer)
	{
		this.traversalHelper = new TraversalHelper();
		this.printer = printer;
	}
	
	@Override
	public void traverse(Graph graph) {
		for (GraphNode node: graph.getNodes())
		{
			printer.appendNodeData(node.getNodeData());
			if (node.getNeighbours().size() == 0)
			{
				printer.appendNullAtPrinterEnd();
				continue;
			}

			List<GraphNode> neighbours = node.getNeighbours();
			for(GraphNode neighbour: neighbours)
			{
				printer.appendNodeData(neighbour.getNodeData());
			}
		}
	}

	@Override
	public String getTraverserInitMessage()
	{
		return "Display all the neighbours of all then nodes";
	}
}
