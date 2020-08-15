package com.leetcode;


/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chenchao
 */
public class AL0002 {
    public static void main(String[] args) {
        ListNode root = new ListNode(2);
        root.next = new ListNode(4);
        root.next.next = new ListNode(6);

        ListNode root1 = new ListNode(5);
        root1.next = new ListNode(6);
        root1.next.next = new ListNode(4);

        ListNode node = new AL0002().addTwoNumbers(root, root1);

        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }

    }

    /**
     * 特点 逆序链表 1 - 2- 3 321
     * 情况1 两数相加<10 则不用进位 ，两数相加 >10 进位然后下一次加1
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int offset = 0;
        ListNode res = new ListNode(0);
        ListNode cursor = res;
        // 在两个链表不为空的情况下遍历
        while (l1 != null || l2 != null || offset != 0) {
            int int1 = l1 == null ? 0 : l1.val;
            int int2 = l2 == null ? 0 : l2.val;

            int tmp = int1 + int2 + offset;
            offset = tmp / 10;
            ListNode node = new ListNode(tmp % 10);
            cursor.next = node;
            cursor = node;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }


        }
        return res.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
