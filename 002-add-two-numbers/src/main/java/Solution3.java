/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution3 extends Solution {

    // 10/05/2022 22:47	Accepted	2 ms	42.3 MB	java

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var res = new ListNode(0);
        var il1 = l1;
        var il2 = l2;
        var restraint = 0;
        var currNode = res;
        while (hasNodes(il1, il2) || restraint > 0) {
            var sum = 0;
            var hasIl1 = il1 != null;
            var hasIl2 = il2 != null;
            sum = hasIl1 ? sum + il1.val : sum;
            sum = hasIl2 ? sum + il2.val : sum;
            sum = sum + restraint;
            restraint = (sum >= 10) ? sum / 10 : 0;
            var currValue = sum - (restraint * 10);
            currNode.val = currValue;
            currNode.next = (hasNext(il1, il2) || restraint > 0) ? new ListNode() : null;
            currNode = currNode.next;
            il1 = hasIl1 ? il1.next : null;
            il2 = hasIl2 ? il2.next : null;
        }
        return res;
    }

    private boolean hasNodes(ListNode il1, ListNode il2) {
        return il1 != null || il2 != null;
    }

    private boolean hasNext(ListNode il1, ListNode il2) {
        return (il1 != null && il1.next != null) || (il2 != null && il2.next != null);
    }
}