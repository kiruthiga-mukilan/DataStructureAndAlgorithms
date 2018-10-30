package com.kiruthi.ds.tree;

public class FindMinInBST {

    static Node findMinInBST(Node node) {
        if (node == null) {
            return null;
        }
        if (node.left == null) {
            return node;
        } else {
            return findMinInBST(node.left);
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

        System.out.println(FindMinInBST.findMinInBST(tree_level.root).key);
    }


}
