package list;

/**
 *  <a href="https://leetcode.cn/problems/swap-nodes-in-pairs/description/">0024</a>
 */
public class Main0024 {

    /**
     * 递归
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;

        return temp;
    }

}
