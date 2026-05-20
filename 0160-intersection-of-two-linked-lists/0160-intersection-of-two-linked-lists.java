/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int alen = getLength(headA);
        int blen = getLength(headB);
        int skip;
        if (alen >= blen) {
            skip = alen - blen;
            for (int i = 0; i < skip; i++) {
                headA = headA.next;
            }
        }
        else {
            skip = blen - alen;
            for (int i = 0; i < skip; i++) {
                headB = headB.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public int getLength(ListNode head) {
        int cnt = 0;
        ListNode current = head;

        while (current != null) {
            cnt++;
            current = current.next;
        }

        return cnt;
    }
}