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
    public int pairSum(ListNode head) {
        int l=0;
        for (ListNode cur=head; cur!=null; cur=cur.next){
            l++;
        }

        ListNode cur=head;
        int m=0;
        Stack<Integer> stack = new Stack<Integer>();
        while (m<(l/2) && cur.next!=null){
            stack.push(cur.val);
            cur=cur.next;
            m++;
        }
        
        int sum=0;
        while (stack.isEmpty()==false && cur!=null){
            int a=stack.pop();
            int b=cur.val;
            sum=Math.max(sum,a+b);
            // System.out.println(sum);
            cur=cur.next;
        }
        return sum;
    }
}
