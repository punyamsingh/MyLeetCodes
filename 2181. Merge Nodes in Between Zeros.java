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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode();
        ListNode anst=ans;
        head=head.next;
        while (head.next!=null){
            ans.val+=head.val;
            if (head.val==0){
                ans.next = new ListNode();
                ans=ans.next;
            }
            head=head.next;
        }
        return anst;
    }
}
