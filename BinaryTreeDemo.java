package Binary_Trees;

public class BinaryTreeDemo {
	
	public static void main(String[] args) {
		BinarySearchTree newTree = new BinarySearchTree();
		Node root = newTree.insertElement(null, 56);
		Node n2 = newTree.insertElement(root, 30);
		Node n3 = newTree.insertElement(n2, 70);
		Node n4 = newTree.insertElement(n3, 22);
		Node n5 = newTree.insertElement(n4, 40);
		Node n6 = newTree.insertElement(n5, 11);
		Node n7 = newTree.insertElement(n6, 3);
		Node n8 = newTree.insertElement(n7, 16);
		Node n9 = newTree.insertElement(n8, 60);
		Node n10 = newTree.insertElement(n9, 95);
		Node n11 = newTree.insertElement(n10, 65);
		Node n12 = newTree.insertElement(n11, 63);
		Node n13 = newTree.insertElement(n12, 67);
		
		newTree.printInorder();
		System.out.println();
		newTree.size();
	}
}
