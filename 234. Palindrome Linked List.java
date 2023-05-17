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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> pall = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
             pall.add(temp.val);
            temp=temp.next;
        }
        int i =0;
        int size=pall.size();
        if(size==1){
            return true;
        }
            int h,l=pall.size()-1,li;
        while(i<l){
            h=pall.get(i);
            li=pall.get(l);
            if(h==li){
                l--;
                i++;
                continue;
            }
            else
                return false;
        }
       
        return true;
    }
}
