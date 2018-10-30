package com.kiruthi.ds.tree;

public class FindMaxInBST {

    static Node findMaxInBST(Node node) {
        if (node == null) {
            return null;
        }
        if (node.right == null) {
            return node;
        } else {
            return findMaxInBST(node.right);
        }
    }

    public static void main(String args[]) {
		/* creating a binary tree and entering
		the nodes */
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(4);
        tree_level.root.left = new Node(3);
        tree_level.root.right = new Node(5);
        tree_level.root.left.left = new Node(1);
        tree_level.root.left.right = new Node(2);

        System.out.println(FindMaxInBST.findMaxInBST(tree_level.root).key);
    }


}
