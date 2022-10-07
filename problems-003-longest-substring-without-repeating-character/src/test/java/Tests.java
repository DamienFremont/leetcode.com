import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    static int when(Solution impl, String in1) {
        System.out.println("");
        var res = impl.lengthOfLongestSubstring(in1);
        return res;
    }

    static void then(int exp, int out) {
        System.out.println("Expected: " + out);
        assertEquals(exp, out);
    }
}
