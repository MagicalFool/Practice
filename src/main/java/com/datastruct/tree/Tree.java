package com.datastruct.tree;

/**
 * @author chenchao
 */
public class Tree {

    public TreeNode root;

    Tree() {
        root = null;
    }

    // insert elem
    public void insert(int id, double dd) {
        TreeNode newNode = new TreeNode();
        newNode.iData = id;
        newNode.fData = dd;
        if (root == null) {
            root = newNode;
        } else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }

            }
        }


    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.iData + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    public void inOrder(TreeNode root) {
        if (root != null) {

            inOrder(root.leftChild);
            System.out.print(root.iData + " ");
            inOrder(root.rightChild);
        }
    }

    public void postOrder(TreeNode root) {
        if (root != null) {

            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.iData + " ");
        }
    }
}
