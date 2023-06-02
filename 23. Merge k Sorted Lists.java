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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0){
            return null;
        }
        return mkl(lists, 0, lists.length-1);
    }
        
    public ListNode mkl(ListNode[] lists, int start, int end){
        int mid = start + (end-start)/2;
        if (start<end){
            ListNode l = mkl(lists, start, mid);
            ListNode r = mkl(lists, mid+1, end);
            return mergeTwoLists(l, r);
        }
        if (start==end){
            return lists[start];
        }
        return null;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if (list1.val<=list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        return (list1==null)?list2:list1;
    }
}
