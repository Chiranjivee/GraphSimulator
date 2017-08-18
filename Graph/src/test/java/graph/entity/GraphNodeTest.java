package graph.entity;

import org.junit.Assert;
import org.junit.Test;

public class GraphNodeTest
{
	
	public static int TEST_NODE_DATA = 5;
	
	@Test
	public void testGetNodeData()
	{
		GraphNode testNode = new GraphNode(TEST_NODE_DATA);
		Assert.assertEquals(
			"Expected " + TEST_NODE_DATA + "as node data, but got " + testNode.getNodeData(),
			TEST_NODE_DATA,
			testNode.getNodeData());
	}
	
	@Test
	public void testSetVisited()
	{
		GraphNode testNode = new GraphNode(TEST_NODE_DATA);
		testNode.setVisited(true);

		Assert.assertEquals(true, testNode.isVisited());
	}
}
