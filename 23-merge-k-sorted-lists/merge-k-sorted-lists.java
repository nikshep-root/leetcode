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
        List<Integer> list = new ArrayList<>();
        for(ListNode l : lists){
            ListNode curr = l;
            while(curr!=null){
                list.add(curr.val);
                curr=curr.next;
            }
        }
        if(list.size() == 0) return null;
        Collections.sort(list);
        ListNode ans= new ListNode(list.get(0));
        ListNode curr = ans;
        for(int i =1;i<list.size();i++){
            curr.next = new ListNode(list.get(i));
            curr= curr.next;
        }
        return ans;
    }
}