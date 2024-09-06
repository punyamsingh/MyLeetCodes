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
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s = new HashSet<>();
        for (int i: nums) s.add(i);

        ListNode t = new ListNode(0);
        t.next=head;
        ListNode c = t;
        while (c.next!=null){
            if (s.contains(c.next.val)){
                c.next=c.next.next;
                continue;
            }
            c=c.next;
        }
        return t.next;
    }
}
