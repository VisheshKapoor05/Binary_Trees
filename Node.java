package Binary_Trees;

public class Node implements Comparable<Node>{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	@Override
	public int compareTo(Node node) {
		return data-node.data;
	}
	

}
