package graph.traverser;

import graph.entity.Graph;
import graph.printer.GraphPrinter;

public class GenericGraphTraverser 
{
	private Graph graph;
	private GraphPrinter printer;
	private GraphTraverser traverser;

	public 
		GenericGraphTraverser(
			Graph graph, 
			GraphTraverser traverserType, 
			GraphPrinter printer)
	{
		this.graph = graph;
		this.traverser = traverserType;
		this.printer = printer;
	}

	public void traverseGraphAndPrint()
	{
		this.printer.clean();
		this.printer.printStartTraversing(traverser.getTraverserInitMessage());
		traverser.traverse(graph);
		this.printer.printGraph();
	}
	
	public void setTraverser(GraphTraverser traverser)
	{
		this.traverser = traverser;
	}
}
