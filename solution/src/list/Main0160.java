package list;

/**
 *  <a href="https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/description/">链表相交</a>
 */
public class Main0160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a =  a == null ? headB : a.next;
            b =  b == null ? headA : b.next;
        }

        return a;
    }

}
