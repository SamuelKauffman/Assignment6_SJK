
/**
 * @author Sam Kauffman 
 * @Version 1.0
 *
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree aTree = new Tree();
		Node root = aTree.generatePracticeTree(5);
		DepthFirstSearch dfs = new DepthFirstSearch();
		
		System.out.println("Depth-First Search Traversal:");
		int treeHeight = dfs.DFS(root);
		
		System.out.println("\nNumber of nodes traversed: " + dfs.getNodeCount()); 
		System.out.println("Height of the tree: " + treeHeight);
	}

}
