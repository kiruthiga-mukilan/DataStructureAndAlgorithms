package com.kiruthi.ds.recursion;

public class TowersOfHanoi {


    static void solveTowersOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        if (n == 1) {
            System.out.println("Moving peg from " + fromPeg + " to " + toPeg);
            return;
        }

        solveTowersOfHanoi(n - 1, fromPeg, auxPeg, toPeg);
        System.out.println("Moving peg from " + fromPeg + " to " + toPeg);
        solveTowersOfHanoi(n - 1, auxPeg, toPeg, fromPeg);

    }

    public static void main(String[] args) {
        TowersOfHanoi.solveTowersOfHanoi(3, 'A', 'B', 'C');
    }
}
