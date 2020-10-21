package com.datastruct.link;

/**
 * @author chenchao
 */
public class TestLinkedList {

    public static void main(String[] args) {
        // 测试LinkedList
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(1, 1);
        linkedList.insertFirst(2, 2);
        linkedList.insertFirst(3, 3);
        linkedList.insertFirst(4, 4);
        linkedList.display();

        while (!linkedList.isEmpty()) {
            LinkedList.Link link = linkedList.deleteFirst();
            link.displayLinked();
            System.out.println();
        }

        linkedList.display();
    }
}
