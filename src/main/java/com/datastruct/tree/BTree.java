package com.datastruct.tree;

import java.util.*;

/**
 * @author chenchao
 */
public class BTree {
    public static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode node = null;
        if (inputList == null || inputList.size() == 0) {
            return null;
        }
        // 创建树
        Integer data = inputList.removeFirst();
        if (data != null) {
            node = new TreeNode();
            node.iData = data;
            node.rightChild = createBinaryTree(inputList);
            node.leftChild = createBinaryTree(inputList);

        }
        return node;
    }

    public static void preOrderTreeWithStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;
        while (treeNode != null || !stack.isEmpty()) {
            while (treeNode != null) {
                System.out.println(treeNode.iData);
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }
            // 如果没有左孩子，访问节点右孩子
            if (!stack.isEmpty()) {
                treeNode = stack.pop();
                treeNode = treeNode.rightChild;
            }
        }
    }

    public static void levelOrder(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);
        while (!queue.isEmpty()) {
            // 出队列
            TreeNode poll = queue.poll();
            System.out.println(poll.iData);
            if (poll.leftChild != null) {
                queue.offer(poll.leftChild);
            }
            if (poll.rightChild != null) {
                queue.offer(poll.rightChild);
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(null);
        list.add(null);
        list.add(10);
        list.add(null);
        list.add(null);
        list.add(8);
        list.add(null);
        list.add(4);


        TreeNode binaryTree = BTree.createBinaryTree(list);

        System.out.println(binaryTree);

        preOrderTreeWithStack(binaryTree);
        System.out.println("------------");
        levelOrder(binaryTree);

    }
}
