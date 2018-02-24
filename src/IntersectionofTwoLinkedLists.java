/**
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * For example, the following two linked lists:
 *
 *
 * A:           a1 → a2
 *                     ↘
 *                      c1 → c2 → c3
 *                     ↗
 * B:      b1 → b2 → b3
 *
 * A: a1 → a2 → c1 → c2 → c3 → b1 → b2 → b3 → c1 → c2 → c3
 * B: b1 → b2 → b3 → c1 → c2 → c3 → a1 → a2 → c1 → c2 → c3
 */

// time : O(m+n)
// space : O(1)

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while( a != b ){
            // 如果 a != null 就到 a.next == null 就到 headB
            a = a == null ? headB : a.next;
            // 如果 b != null 就到 b.next == null 就到 headA
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
