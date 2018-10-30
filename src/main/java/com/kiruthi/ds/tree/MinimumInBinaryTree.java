package com.kiruthi.ds.tree;

public class MinimumInBinaryTree {

    // Returns the min value in a binary tree
    static int findMin(Node node)
    {
        if (node == null)
            return Integer.MAX_VALUE;

        int res = node.key;
        int lres = findMin(node.left);
        int rres = findMin(node.right);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
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

        System.out.println(MinimumInBinaryTree.findMin(tree_level.root));
    }

}
