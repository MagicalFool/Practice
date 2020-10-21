package com.datastruct.tree;

public class TreeADT {

    private TreeNode root = null;


    public TreeNode find(int key) {
        TreeNode current = root;
        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null) {
                return null; // not find
            }
        }
        return current; // find it
    }

    public void insert(int id, double dd) {
        TreeNode newNode = new TreeNode(id, dd);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild; // current 是左叶子节点
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


    public void inOrder(TreeNode localNode) {
        if (localNode != null) {
            inOrder(localNode.leftChild);
            System.out.print(localNode.iData + "-");
            inOrder(localNode.rightChild);
        }
    }

//    public void inOrder(TreeNode localNode){
//        if (localNode != null){
//            inOrder(localNode.leftChild);
//            System.out.println(localNode.iData + "-");
//            inOrder(localNode.rightChild);
//        }
//    }

    public void preOrder(TreeNode localNode) {
        if (localNode != null) {
            System.out.print(localNode.iData + "-");
            preOrder(localNode.leftChild);
            preOrder(localNode.rightChild);
        }
    }

    public TreeNode getRoot() {
        return root;
    }
}

