/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int res = 0;
        while (curr != null) {
            res = res << 1;
            res += curr.val;
            curr = curr.next;
        }
        return res;
    }
}
