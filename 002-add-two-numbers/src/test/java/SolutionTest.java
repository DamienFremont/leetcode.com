import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void example1() {
        var cut = new Solution();

        var arg1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var arg2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        var expc = new ListNode(7, new ListNode(0, new ListNode(8)));

        var res = cut.addTwoNumbers(arg1, arg2);

        assertNotNull(res);
        assertEquals(expc.val, res.val);
        assertEquals(expc.next.val, res.next.val);
        assertEquals(expc.next.next.val, res.next.next.val);
    }

}