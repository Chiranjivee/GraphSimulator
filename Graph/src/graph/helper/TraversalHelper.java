package graph.helper;

import graph.entity.GraphNode;

import java.util.List;

public class TraversalHelper 
{
	/**
	 * Helper to mark all the nodes as unvisited.
	 *
	 * @param graphNodes
	 */
	public void 
		markAllNodesUnvisited(
			List<GraphNode> graphNodes)
	{
		for (GraphNode node : graphNodes)
		{
			node.setVisited(false);
		}
	}

	/**
	 * Helper to visit unvisited node and 
	 * add to queue.
	 *
	 * @param neighbourNode
	 * @param visitedNeighboursQueue
	 */
	public void
		visitUnvisitedNode(
			GraphNode neighbourNode,
			List<GraphNode> visitedNeighboursQueue)
	{
		if (!neighbourNode.isVisited())
		{
			neighbourNode.setVisited(true);

			// Add the neighbour to the queue.
			//visitedNeighboursQueue.add(neighbourNode);
//			visitedNeighboursQueue.add(0, neighbourNode);
		}
	}
}
