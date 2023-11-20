/**
 * @author Sam Kauffman
 * @Version 1.0
 *
 */
public class DepthFirstSearch {

	Node root;
	int nodeCount;

	/**
	*  Constructor
	*/
	public DepthFirstSearch() {
		System.out.println("Call DFS with root node to do a Depth First Search.");
		nodeCount = 0;
	}
	
	/**
	 * @param node
	 * @return returns current height of the current node
	 */
	public int DFS(Node node) {
		if (node == null) {
			return 0;
		}

		nodeCount++;

		System.out.println(node.getData());

		int leftHeight = DFS(node.getlChild());

		int rightHeight = DFS(node.getrChild());

		int currentHeight = 1 + Math.max(leftHeight, rightHeight);

		return currentHeight;

	}

	/**
	 * @return how many nodes are in the tree
	 */
	public int getNodeCount() {
		return nodeCount;
	}

}