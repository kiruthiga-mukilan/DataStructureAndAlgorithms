package com.kiruthi.ds.tree;

public class MirrorOfBinaryTree {

    static Node mirror(Node root) {
        if (root == null) {
            return root;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
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

        MirrorOfBinaryTree.mirror(tree_level.root);
        System.out.println();
    }
}
