
public class Driver {
    
    public static void main(String[] args) {
	BinaryTree tree = new BinaryTree(new Node(20));

	tree.insert(tree.getRoot(), 25);
	tree.insert(tree.getRoot(), 5);
	tree.insert(tree.getRoot(), 10);
	tree.insert(tree.getRoot(), 40);
	tree.insert(tree.getRoot(), 75);
	tree.insert(tree.getRoot(), 34);

	System.out.println();
	
    }
    
}
