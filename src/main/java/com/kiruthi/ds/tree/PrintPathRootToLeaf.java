package com.kiruthi.ds.tree;

public class PrintPathRootToLeaf {
    static int[] path = new int[256];

    static void printPathRootToLeaf(Node root, int[] path, int pathLength) {
        if (root == null) return;
        path[pathLength] = root.key;
        pathLength++;
        if (root.left == null && root.right == null) {
            printArray(path, pathLength);
        } else {
            printPathRootToLeaf(root.left, path, pathLength);
            printPathRootToLeaf(root.right, path, pathLength);
        }
    }

    static void printArray(int[] path, int pathLength) {
        for (int i = 0; i < pathLength; i++)
            System.out.println(path[i] + " ");
        System.out.println();
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

        PrintPathRootToLeaf.printPathRootToLeaf(tree_level.root, path, 4);
    }

}
