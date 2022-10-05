import java.math.BigInteger;

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

    // 10/05/2022 22:45	Accepted	83 ms	62.6 MB	java

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
        System.out.println("Explanation: " + toNumber(l1) + " + " + toNumber(l2) + " = " + toNumber(res));
        System.out.println("Output: " + toNumber(res));
        return res;
    }

    private boolean hasNodes(ListNode il1, ListNode il2) {
        return il1 != null || il2 != null;
    }

    private boolean hasNext(ListNode il1, ListNode il2) {
        return (il1 != null && il1.next != null) || (il2 != null && il2.next != null);
    }

    private BigInteger toNumber(ListNode node) {
        return toNumberLoop(node, new BigInteger("0"), new BigInteger("1"));
    }

    private BigInteger toNumberLoop(ListNode node, BigInteger val, BigInteger order) {
        var res = val.add(order.multiply(new BigInteger(node.val + "")));
        if (node.next != null) {
            return toNumberLoop(node.next, res, order.multiply(new BigInteger("10")));
        }
        return res;
    }
}