package graph.traverser;

import graph.entity.Graph;
import graph.entity.GraphNode;
import graph.helper.TraversalHelper;
import graph.printer.GraphPrinter;

import java.util.LinkedList;

public class BFSTraverser implements GraphTraverser
{
	private TraversalHelper traversalHelper;
	private GraphPrinter printer;

	public BFSTraverser(GraphPrinter printer)
	{
		this.traversalHelper = new TraversalHelper();
		this.printer = printer;
	}
	
	@Override
	public void 
		traverse(
			Graph graph)
	{
		traversalHelper.markAllNodesUnvisited(graph.getNodes());
		for (GraphNode node : graph.getNodes())
		{
			if (!node.isVisited())
			{
				LinkedList<GraphNode> visitedNodesQueue = new LinkedList<GraphNode>();
				traversalHelper.visitUnvisitedNode(node, visitedNodesQueue);

				while(!visitedNodesQueue.isEmpty())
				{
					GraphNode visitedNode = visitedNodesQueue.poll();
					printer.appendNodeData(visitedNode.getNodeData());

					// Visit unvisited neighbors.
					for (GraphNode neighbourNode: visitedNode.getNeighbours())
					{
						traversalHelper.visitUnvisitedNode(neighbourNode, visitedNodesQueue);
					}
				}
			}
		}

		printer.appendNullAtPrinterEnd();
	}

	@Override
	public String getTraverserInitMessage()
	{
		return "Printing BFS for graph:";
	}
}
