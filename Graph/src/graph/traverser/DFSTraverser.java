package graph.traverser;

import graph.entity.Graph;
import graph.entity.GraphNode;
import graph.helper.TraversalHelper;
import graph.printer.GraphPrinter;

import java.util.LinkedList;
import java.util.List;

public class DFSTraverser implements GraphTraverser
{
	private TraversalHelper traversalHelper;
	private GraphPrinter printer;

	public DFSTraverser(GraphPrinter printer)
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
				if (!node.isVisited())
				{
					node.setVisited(true);
				}

				visitedNodesQueue.add(node);

				while(!visitedNodesQueue.isEmpty())
				{
					GraphNode visitedNode = visitedNodesQueue.poll();
					printer.appendNodeData(visitedNode.getNodeData());

					// Visit unvisited neighbors.
					List<GraphNode> unvisitedNeighbours = new LinkedList<>();
					for (GraphNode neighbourNode: visitedNode.getNeighbours())
					{
						if (!neighbourNode.isVisited())
						{
							unvisitedNeighbours.add(neighbourNode);
							neighbourNode.setVisited(true);
						}
					}

					visitedNodesQueue.addAll(0, unvisitedNeighbours);
				}
			}
		}

		printer.appendNullAtPrinterEnd();
	}

	@Override
	public String getTraverserInitMessage()
	{
		return "Printing DFS for graph:";
	}
}
