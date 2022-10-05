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
class Solution2 extends Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var res = new ListNode(0);
        var il1 = l1;
        var il2 = l2;
        var restraint = 0;
        var currNode = res;
        while (il1 != null || il2 != null) {
            var sum = 0;
            var hasIl1 = il1 != null;
            var hasIl2 = il2 != null;
            sum = hasIl1 ? sum + il1.val : sum;
            sum = hasIl2 ? sum + il2.val : sum;
            sum = sum + restraint;
            restraint = (sum >= 10) ? sum / 10 : 0;
            var currValue = sum - (restraint * 10);
            currNode.val = currValue;
            currNode.next = new ListNode();
            currNode = currNode.next;
            il1 = hasIl1 ? il1.next : null;
            il2 = hasIl2 ? il2.next : null;
        }
        System.out.println("Explanation: " + l1 + " + " + l2 + " = " + res);
        System.out.println("Output: " + res);
        return res;
    }
}