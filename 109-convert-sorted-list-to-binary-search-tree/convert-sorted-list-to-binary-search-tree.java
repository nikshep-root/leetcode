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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head,null);
    }
    private TreeNode buildTree(ListNode start,ListNode end){
        if(start == end) return null;
        ListNode mid = findMid(start,end);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildTree(start,mid);
        root.right = buildTree(mid.next,end);
        return root;
    }
    private ListNode findMid(ListNode start,ListNode end){
        ListNode slow = start;
        ListNode fast = start;
        while(fast != end && fast.next != end){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}