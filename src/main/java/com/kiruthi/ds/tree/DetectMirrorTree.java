package com.kiruthi.ds.tree;

public class DetectMirrorTree {

    static boolean isMirror(Node root1, Node root2) {

        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) return false;
        if (root1.key != root2.key) {
            return false;
        }
        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
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

        BinaryTree tree_level1 = new BinaryTree();
        tree_level1.root = new Node(1);
        tree_level1.root.left = new Node(3);
        tree_level1.root.right = new Node(2);
        tree_level1.root.right.left = new Node(5);
        tree_level1.root.right.right = new Node(4);


        System.out.println(DetectMirrorTree.isMirror(tree_level.root, tree_level1.root));
    }

}
