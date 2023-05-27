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
    public int getDecimalValue(ListNode head) {
        int len=0;
        ListNode temp = head;
        while (temp!=null){
            temp=temp.next;
            len++;
        }
        return convert(head, len-1);
        // return len;
    }

    int convert(ListNode root, int n){
        if (root==null){
            return 0;
        }
        if (n==0){
            return root.val;
        }
        // System.out.println((root.val)*((int)Math.pow(2,n)));
        return ((root.val)*((int)Math.pow(2,n)))+convert(root.next, n-1);
    }
}
