/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReversePrint {
    public int[] reversePrint(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();;
        ListNode curr = head;
        while (curr != null) {
            deque.addFirst(curr.val);
            curr = curr.next;
        }
        int len = deque.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = deque.pollFirst();
        }
        return res;
    }
}
