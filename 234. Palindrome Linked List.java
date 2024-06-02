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
        // Use two pointers: slow moves one step at a time and fast moves two steps at a time.
        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer to the end, and slow to the middle of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        ListNode prev = null;
        ListNode current = slow;
        while (current != null) {
            ListNode temp = current.next; // Stores the next node
            current.next = prev; // Reverses the link
            prev = current; // Moves prev to current node
            current = temp; // Move to the next node in the original list
        }

        // Compare the reversed second half with the first half
        ListNode firstHalfIterator = head;
        ListNode secondHalfIterator = prev;
        while (secondHalfIterator != null) {
            // If values are different, then it's not a palindrome
            if (secondHalfIterator.val != firstHalfIterator.val) {
                return false;
            }

            // Move to the next nodes in both halves
            secondHalfIterator = secondHalfIterator.next;
            firstHalfIterator = firstHalfIterator.next;
        }

        // All values matched, so it's a palindrome
        return true;


    }
}
