package list;

/**
 * <a href="https://leetcode.cn/problems/remove-linked-list-elements/description/">0203</a>
 */
public class Main0203 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        }else {
            return head;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


