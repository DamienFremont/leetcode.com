import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    private static Stream<Arguments> provideImpl() {
        return Stream.of(
                Arguments.of(new Solution()),
                Arguments.of(new Solution2())
        );
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example1(Solution impl) {
        var in1 = "abcabcbb";
        var exp = 3;

        var out = Tests.when(impl, in1);

        Tests.then(exp, out);
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example2(Solution impl) {
        var in1 = "bbbbb";
        var exp = 1;

        var out = Tests.when(impl, in1);

        Tests.then(exp, out);
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example3(Solution impl) {
        var in1 = "pwwkew";
        var exp = 3;

        var out = Tests.when(impl, in1);

        Tests.then(exp, out);
    }
}