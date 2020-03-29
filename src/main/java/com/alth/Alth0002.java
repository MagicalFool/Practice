package com.alth;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 */
public class Alth0002 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);
        node1.next = new ListNode(8);
//        node1.next.next = new ListNode(9);

        ListNode node2 = new ListNode(1);
//        node2.next = new ListNode(9);
//        node2.next.next = new ListNode(9);
        ListNode listNode = new Alth0002().method2(node1, node2);

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;

    }

    ListNode method2(ListNode l1, ListNode l2){
                // 从两个链表第一个节点开始扫描，获取到val之后相加
        ListNode newNode = new ListNode(0); // 新的链表

        ListNode cur = newNode;

        ListNode p1 = l1;

        ListNode p2 = l2;

        int carry = 0;
        while (p1 != null || p2 != null) {
            int v1 = 0;
            int v2 = 0;
            if (p1 != null) {
                v1 = p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                v2 = p2.val;
                p2 = p2.next;
            }

            int sum = v1 + v2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);
            cur = cur.next;

        }

        if (carry == 1){
            cur.next = new ListNode(1);
        }

        return newNode.next;
    }

}


class ListNode {
    int val;
    ListNode next;
    int length;

    ListNode(int x) {
        val = x;
    }

    void put(int x) {
        while (next != null) {

        }
    }

    @Override
    public String toString() {
        ListNode node = this;
        String str = "ListNode";


        return str;

    }
}