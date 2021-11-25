package Binary_Trees;

public class BinaryTreeDemo {
	
	public static void main(String[] args) {
		BinarySearchTree newTree = new BinarySearchTree();
		Node root = newTree.insertElement(null, 56);
		Node node2 = newTree.insertElement(root, 30);
		Node node3 = newTree.insertElement(node2, 70);
		
		
		//System.out.println(root.data);
		newTree.printInorder();
		//newTree.inorderTraversal(root);
	}
}
