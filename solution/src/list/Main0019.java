package list;

/**
 * <a href="https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/">0019</a>
 */
public class Main0019 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;

        int length = 0;
        ListNode curr = dummy;
        while (head != null) {
            length++;
            head = head.next;
        }

        int index = length - n;

        int current = 0;
        while (index != current) {
            current++;
            curr = curr.next;

        }

        curr.next = curr.next.next;
        return dummy.next;
    }

}
