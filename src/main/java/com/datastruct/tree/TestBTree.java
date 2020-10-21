package com.datastruct.tree;

/**
 * 测试二叉树
 *
 * @author chenchao
 */
public class TestBTree {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(3, 1);
        tree.insert(2, 2);
        tree.insert(1, 3);
        tree.insert(4, 4);

        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

    }
}
