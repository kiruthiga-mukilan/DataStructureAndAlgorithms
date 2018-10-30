package com.kiruthi.ds.tree;

public class FindElementInBST {

    static Node isElementInBST(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.key) {
            return isElementInBST(root.left, data);
        } else if (data > root.key) {
            return isElementInBST(root.right, data);
        }
        return root;
    }

    public static void main(String args[]) {
		/* creating a binary tree and entering
		the nodes */
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println(FindElementInBST.isElementInBST(tree_level.root, 5));
    }

    // In-Order traversal of BST produced SortedList
}
