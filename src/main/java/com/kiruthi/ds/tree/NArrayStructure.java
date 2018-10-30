package com.kiruthi.ds.tree;

public class NArrayStructure {

    int data;
    NArrayStructure firstChild;
    NArrayStructure nextSibling;

    // Expression / XOR Trees

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NArrayStructure getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(NArrayStructure firstChild) {
        this.firstChild = firstChild;
    }

    public NArrayStructure getNextSibling() {
        return nextSibling;
    }

    public void setNextSibling(NArrayStructure nextSibling) {
        this.nextSibling = nextSibling;
    }
}
