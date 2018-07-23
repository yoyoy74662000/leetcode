/**
 * Given a singly linked list, determine if it is a palindrome.

 Example 1:

 Input: 1->2
 Output: false

 Example 2:

 Input: 1->2->2->1
 Output: true
 */

// time : O(n)
// space : O(1)

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode middle = findmiddle(head);
        ListNode secondhead = reverse(middle.next);
        middle.next = null;

        ListNode p = head;
        ListNode q = secondhead;
        while(p != null && q != null){
            if(p.val != q.val){
                return false;
            }else{
                p = p.next;
                q = q.next;
            }
        }
        return true;
    }

    public ListNode findmiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        //1->2->2->1
        // fast.next 相當於slow fast.next.next 相當於slow
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
