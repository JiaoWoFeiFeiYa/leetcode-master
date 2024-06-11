package list;

/**
 * <a href="https://leetcode.cn/problems/linked-list-cycle-ii/description/">环形链表</a>
 */
public class Main0142 {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        ListNode pos = head;
        while (pos != slow) {
            pos = pos.next;
            slow = slow.next;
        }

        return pos;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;

        new Main0142().detectCycle(l1);
    }

}
