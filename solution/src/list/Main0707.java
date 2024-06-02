package list;

/**
 * <a href="https://leetcode.cn/problems/design-linked-list/description/">707</a>
 */
public class Main0707 {

    public static class MyLinkedList {

        public int size;
        public ListNode head;

        public MyLinkedList() {
            size = 0;
            head = new ListNode();
        }

        public int get(int index) {
            if (index <= 0 || index >= size) {
                return -1;
            }

            ListNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) {
                return;
            }

            size++;

            ListNode current = head;
            for (int i = 0; i < index; i++) {
                current = head.next;
            }

            ListNode listNode = new ListNode();

            listNode.val = val;
            listNode.next = current.next;
            current.next = listNode;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }
            size--;
            ListNode pred = head;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            pred.next = pred.next.next;
        }
    }

    public static class ListNode {
        public ListNode next;
        public int val;
    }
}
