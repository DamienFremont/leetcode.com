
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
        var num1 = toInt(l1);
        var num2 = toInt(l2);
        var res = num1 + num2;
        System.out.println("Explanation: " + num1 + " + " + num2 + " = " + res);
        return toListNode(res);
    }

    private int toInt(ListNode node) {
        return toIntLoop(node, 0, 1);
    }

    private int toIntLoop(ListNode node, int val, int order) {
        var res = val + (node.val * order);
        if (node.next != null) {
            return toIntLoop(node.next, res, order * 10);
        }
        return res;
    }

    private ListNode toListNode(int arg) {
        var chars = Integer.toString(arg);
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