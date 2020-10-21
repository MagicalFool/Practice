package com.datastruct.tree;

/**
 * 树的节点类
 *
 * @author chenchao
 */
public class TreeNode {
    int iData;
    double fData;
    TreeNode leftChild;
    TreeNode rightChild;

    public void displayNode() {
        System.out.println("[" + iData + "," + fData + "]");
    }

    public TreeNode() {
    }

    public TreeNode(int iData, double fData) {
        this.iData = iData;
        this.fData = fData;
    }
}
