/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeInBetween {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode leftOfList1 = list1;
        ListNode headOfList2 = list2;
        ListNode tailOfList2 = list2;
        for (int i = 1; i < a; i++) {
            leftOfList1 = leftOfList1.next;
        }
        ListNode rightOfList1 = leftOfList1.next;
        for (int i = 0; i <= b - a; i++) {
            rightOfList1 = rightOfList1.next;
        }
        while (tailOfList2.next != null) {
            tailOfList2 = tailOfList2.next;
        }
        leftOfList1.next = headOfList2;
        tailOfList2.next = rightOfList1;
        return list1;
    }
}
