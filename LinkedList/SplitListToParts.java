/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SplitListToParts.java {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = getLength(root);
        int averageLen = len / k;
        int remain = len % k;
        ListNode[] res = new ListNode[k];
        for (int i =0; i < k; i++) {
            ListNode splitList = root;
            res[i] = splitList;
            for (int j = 0; j < averageLen + (i < remain ? 1 : 0) - 1; j++) {
                if (root != null) {
                    root = root.next;
                }
            }
            if (root != null) {
                ListNode curr = root;
                root = root.next;
                curr.next = null;
            }
            
        }
        return res;
    }
    public int getLength(ListNode root) {
        int count = 0;
        while (root != null) {
            count++;
            root = root.next;
        }
        return count;
    }
}
