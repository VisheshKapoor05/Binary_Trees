package Binary_Trees;

class BinarySearchTree {
	
	Node root;
	
	public Node insertElement(Node root , int data) {
		
		if(root == null) {
			Node node1 = new Node(data);
			root = node1;
			return root;
		}
		Node node1 = new Node(data);
		if(node1.compareTo(root) < 0) {
			root.left = insertElement(root.left, data);
		}
		else if(node1.compareTo(root) > 0) {
			root.right = insertElement(root.right, data);
		}
		this.root = root;
		return root;
	}
	
	
	public void inorderTraversal(Node node) {
		if(node == null) {
			return;
		}
		
		inorderTraversal(node.left);
		System.out.println(node.data + " ");
		inorderTraversal(node.right);
	}
	
	public void printInorder() {
		inorderTraversal(root);
	}
}
