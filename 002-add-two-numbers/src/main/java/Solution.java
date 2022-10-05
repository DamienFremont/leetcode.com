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
class Solution {

    // 10/05/2022 14:58	Accepted	73 ms	55 MB

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var num1 = toNumber(l1);
        var num2 = toNumber(l2);
        var res = num1.add(num2);
        System.out.println("Explanation: " + num1 + " + " + num2 + " = " + res);
        System.out.println("Output: "+res);
        return toListNode(res);
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

    private ListNode toListNode(BigInteger arg) {
        var chars = arg.toString();
        ListNode last = null;
        for (int i = 0; i < chars.length(); i++) {
            var c = chars.charAt(i);
            var actu = new ListNode();
            actu.val = Integer.valueOf(c + "");
            actu.next = last;
            last = actu;
        }
        return last;
    }
}