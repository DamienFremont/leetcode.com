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
        assertEquals(2, res.length, "length");
        var ord = (exp[0] == res[0]) && (exp[1] == res[1]);
        var rev = (exp[0] == res[1]) && (exp[1] == res[0]);
        assertTrue(ord || rev);
    }

    static String toString(int[] ints) {
        var res = new StringBuilder("");
        for (var i : ints) {
            res.append(i);
        }
        return res.toString();
    }
}
