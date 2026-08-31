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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        ListNode prev = head;
        ListNode curr = head.next;
        int currIdx = 1;
        int prevIdx = 0;
        int minDist = Integer.MAX_VALUE;
        int prevCI = 0;
        int firstCI = 0;
        while(curr.next!=null){
            if((curr.val < prev.val && curr.val < curr.next.val) || (curr.val > prev.val && curr.val > curr.next.val)){
                if(prevCI == 0){
                    prevCI = currIdx;
                    firstCI = currIdx;
                }
                else{
                    minDist = Math.min(minDist,currIdx-prevCI);
                    prevCI=currIdx;
                }
            }
            currIdx++;
            prev=prev.next;
            curr=curr.next;
        }
        if(minDist!=Integer.MAX_VALUE){
            int maxDist= prevCI-firstCI;
            
            ans[0]=minDist;
            ans[1]=maxDist; 
        }
        return ans;
    }
}