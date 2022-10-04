import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void example1() {
        var arg1 = new int[]{2, 4, 3};
        var arg2 = new int[]{5, 6, 4};
        var exp = new int[]{7, 0, 8};

        var res = when(arg1, arg2);

        then(exp, res);
    }

    @Test
    void example2() {
        var arg1 = new int[]{0};
        var arg2 = new int[]{0};
        var exp = new int[]{0};

        var res = when(arg1, arg2);

        then(exp, res);
    }

    @Test
    void example3() {
        var arg1 = new int[]{9, 9, 9, 9, 9, 9, 9};
        var arg2 = new int[]{9, 9, 9, 9};
        var exp = new int[]{8, 9, 9, 9, 0, 0, 0, 1};

        var res = when(arg1, arg2);

        then(exp, res);
    }

    @Test
    void example33() {
        var arg1 = new int[]{9};
        var arg2 = new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        var exp = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

        var res = when(arg1, arg2);

        then(exp, res);
    }

    private void then(int[] exp, ListNode res) {
        System.out.println("Expected: " + toString(exp));
        assertTrue(res != null);
        var last = res;
        for (var xxx : exp) {
            assertEquals(xxx, last.val);
            last = last.next;
        }
    }

    private ListNode when(int[] arg1, int[] arg2) {
        var cut = new Solution();
        var res = cut.addTwoNumbers(toListNode(arg1), toListNode(arg2));
        return res;
    }

    private String toString(int[] exp) {
        var res = "";
        for (var i : exp) {
            res = res + i;
        }
        return res;
    }

    private ListNode toListNode(int[] args) {
        System.out.println("Input:" + args);
        ListNode last = null;
        for (int i = args.length - 1; i >= 0; i--) {
            var curr = new ListNode(args[i], last);
            System.out.println(curr.val);
            last = curr;
        }
        return last;
    }
}