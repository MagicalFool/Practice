package com.alth;

import com.datastruct.link.LinkedList;
import com.datastruct.tree.TreeNode;

public class Alth0007 {


    public static void main(String[] args) {

    }

    public class Node {
        public int iData;
        public double dData;
        public Node next;

        public Node(int i, double d) {
            iData = i;
            dData = d;
        }

        public void displayLinked() {
            System.out.println("{" + iData + "," + dData + "}");
        }

    }
    public void delete(Node node, int n){
        Node currentNode = node;
        // 找到前驱
        while (n > 1 & currentNode.next != null){
            currentNode = currentNode.next;
            n -- ;
        }
        // 找到后驱
        Node last = currentNode.next;
        currentNode.next = last;
    }
}
