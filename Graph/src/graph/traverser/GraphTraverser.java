package graph.traverser;

import graph.entity.Graph;

public interface GraphTraverser 
{
	void traverse(Graph graph);
	
	String getTraverserInitMessage();
}
