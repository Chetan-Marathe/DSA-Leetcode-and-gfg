class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    // Root node
    Node root;

    // Constructor
    BinaryTree() {
        root = null;
    }

    // Traversals
    void printInOrder(Node node) {
        if (node == null) return;

        printInOrder(node.left);        // Left
        System.out.print(node.data + " "); // Root
        printInOrder(node.right);       // Right
    }
}
public class Main{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually creating tree:
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal:");
        tree.printInOrder(tree.root);  // Output: 4 2 5 1 3

        
    }
}

