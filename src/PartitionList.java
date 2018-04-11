/**
 * Given a linked list and a value x,
 * partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 */


// time: O(n)
// space: O(1)


public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode smallhead = new ListNode(0);
        ListNode bighead = new ListNode(0);
        ListNode small = smallhead;
        ListNode big = bighead;
        while(head != null){
            ListNode temp = new ListNode(head.val);
            if(head.val < x){
                small.next = temp;
                small = small.next;
            }else{
                big.next = temp;
                big = big.next;
            }
            head = head.next;
        }
        small.next = bighead.next;
        return smallhead.next;

    }
}
