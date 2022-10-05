import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    static void then(int[] exp, ListNode res) {
        System.out.println("Expected: " + toString(exp));
        assertTrue(res != null);
        var last = res;
        for (var xxx : exp) {
            assertEquals(xxx, last.val);
            last = last.next;
        }
        assertNull(last);
    }

    static ListNode when(Solution cut, int[] arg1, int[] arg2) {
        System.out.println("");
        var res = cut.addTwoNumbers(toListNode(arg1), toListNode(arg2));
        return res;
    }

    static String toString(int[] exp) {
        var res = new StringBuilder("");
        for (var i : exp) {
            res.append(i);
        }
        return res.reverse().toString();
    }

    static ListNode toListNode(int[] args) {
        System.out.println("Input:" + args);
        ListNode last = null;
        for (int i = args.length - 1; i >= 0; i--) {
            var curr = new ListNode(args[i], last);
            last = curr;
        }
        return last;
    }
}
