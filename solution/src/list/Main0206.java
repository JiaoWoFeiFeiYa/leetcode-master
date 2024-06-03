package list;

/**
 * <a href="https://leetcode.cn/problems/reverse-linked-list/description/">0206</a>
 */
public class Main0206 {

    // 迭代
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    // 递归
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode listNode = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }

}
