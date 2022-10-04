
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var num1 = toNumber(l1);
        var num2 = toNumber(l2);
        var res = num1 + num2;
        System.out.println("Explanation: " + num1 + " + " + num2 + " = " + res);
        System.out.println("Output: "+res);
        return toListNode(res);
    }

    private long toNumber(ListNode node) {
        return toNumberLoop(node, 0, 1);
    }

    private long toNumberLoop(ListNode node, long val, long order) {
        var res = val + (node.val * order);
        if (node.next != null) {
            return toNumberLoop(node.next, res, order * 10);
        }
        return res;
    }

    private ListNode toListNode(long arg) {
        var chars = Long.toString(arg);
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