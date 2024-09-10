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
    private int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};  // right, down, left, up

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] grid = new int[m][n];
        Arrays.stream(grid).forEach(a -> Arrays.fill(a, -1));  // Fill the grid with -1 to mark unfilled cells

        int row = 0, col = 0, d = 0;  // Start from the top-left corner, and move right initially
        ListNode current = head;

        while (current != null) {
            grid[row][col] = current.val;  // Fill the current cell with the node's value
            current = current.next;  // Move to the next node in the linked list

            // Calculate the next position in the current direction
            int nextRow = row + dir[d][0];
            int nextCol = col + dir[d][1];

            // If the next position is out of bounds or the cell is already filled, change direction
            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || grid[nextRow][nextCol] != -1) {
                d = (d + 1) % 4;  // Change direction
                nextRow = row + dir[d][0];
                nextCol = col + dir[d][1];
            }

            // Update row and col to the new position
            row = nextRow;
            col = nextCol;
        }

        return grid;
    }
}
