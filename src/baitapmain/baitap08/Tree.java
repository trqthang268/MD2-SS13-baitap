package baitapmain.baitap08;

public class Tree {
    public static void main(String[] args) {
        BST tree = new BST();
        Node root = new Node(27);
        tree.root = root;
        root.left= new Node(14);
        root.left.left= new Node(10);
        root.left.right= new Node(19);
        root.right =new Node(35);
        root.right.left=new Node(31);
        root.right.right=new Node(42);
        tree.addTree(root);
    }
}
