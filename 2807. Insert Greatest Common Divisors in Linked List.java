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
    private int gcd(int a, int b){
        if (b==0) return a;
        else return gcd(b,a%b);       
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;

        while (temp.next!=null){
            int x=temp.val;
            int y=temp.next.val;
            int v=1;
            if (x>=y) v=gcd(x,y);
            else v=gcd(y,x);

            ListNode l = new ListNode(v, temp.next);
            temp.next=l;
            temp=l.next;
        }

        return head;
    }
}
