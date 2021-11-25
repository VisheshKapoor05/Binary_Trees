package Binary_Trees;

class BinarySearchTree {
	
	Node root;		// creating a root node for the start 
	int size =0;
	
	public Node insertElement(Node root , int data) {
		
		if(root == null) {					// creating new node at the end of subtree
			Node node1 = new Node(data);
			root = node1;
			
			//increasing size of the tree
			size++;
			
			return root;
		}
		Node sampleNode = new Node(data);    // storing data in a sample node to compare it with root data
		
		//comparing the sample root data and sorting it to either left or right
		if(sampleNode.compareTo(root) < 0) {
			root.left = insertElement(root.left, data);
		}
		else if(sampleNode.compareTo(root) > 0) {
			root.right = insertElement(root.right, data);
		}
		
		this.root = root;
		return root;
	}
	
	
	public void size() {
		System.out.println("size of the tree: " +size);
		if(size==13)
			System.out.println("Yes, all the elements are added successfully");
		else
			System.out.println("No, all the elements are not added ");
	}
	
	
	// searching and printing values of the tree in inorder traversal
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
