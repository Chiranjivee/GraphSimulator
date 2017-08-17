package graph.printer;

public class GraphPrinter
{
	private StringBuilder printer;
	private static final String SEPARATOR = " => ";
	private static final String NULL_SEPARATOR = "X";
	private static final String NEW_LINE = "\n";

	public GraphPrinter()
	{
		printer = new StringBuilder();
	}

	public void
		appendNodeData(
			int data)
	{
		printer.append(data + SEPARATOR);
	}

	public void appendNullAtPrinterEnd()
	{
		printer.append(NULL_SEPARATOR + NEW_LINE);
	}

	public void printGraph()
	{
		this.appendNullAtPrinterEnd();
		System.out.println(printer);
	}
	
	public void printStartTraversing(String message)
	{
		System.out.println(message);
	}
	
	public void clean()
	{
		this.printer = new StringBuilder();
	}
}
