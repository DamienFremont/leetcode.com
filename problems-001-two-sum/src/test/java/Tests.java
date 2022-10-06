import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    static int[] when(Solution cut, int[] arg1, int arg2) {
        System.out.println("");
        var res = cut.twoSum(arg1, arg2);
        return res;
    }

    static void then(int[] exp, int[] res) {
        System.out.println("Expected: " + toString(exp));
        assertTrue(res != null);
        assertEquals(exp.length, res.length, "length");
        for (int i = 0; i < exp.length; i++) {
            assertEquals(exp[i], res[i]);
        }
    }

    static String toString(int[] ints) {
        var res = new StringBuilder("");
        for (var i : ints) {
            res.append(i);
        }
        return res.toString();
    }
}
