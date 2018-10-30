package com.kiruthi.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumSumOnLevels {


    static int findMaximumSumOnLevels(Node root) {

        int maxSum = 0, currSum = 0;

        if (root == null) return 0;

        Queue<Node> l = new LinkedList<Node>();
        l.offer(root);
        l.offer(null);

        while (!l.isEmpty()) {
            Node temp = l.poll();
            if (temp != null) {
                currSum = currSum + temp.key;
                // System.out.println(temp.key);
                if (temp.left != null) {
                    l.offer(temp.left);
                }
                if (temp.right != null) {
                    l.offer(temp.right);
                }
            } else {
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                currSum = 0;
                if (!l.isEmpty()) {
                    l.offer(null);
                }
            }
        }

        return maxSum;
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

        System.out.println(MaximumSumOnLevels.findMaximumSumOnLevels(tree_level.root));
    }


}
