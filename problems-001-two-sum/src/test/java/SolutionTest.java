import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class SolutionTest {

    private static Stream<Arguments> provideImpl() {
        return Stream.of(
                Arguments.of(new Solution()),
                Arguments.of(new Solution2()),
                Arguments.of(new Solution3())
        );
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example1(Solution impl) {
        var arg1 = new int[]{2, 7, 11, 15};
        var arg2 = 9;
        var exp = new int[]{0, 1};

        var res = Tests.when(impl, arg1, arg2);

        Tests.then(exp, res);
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example2(Solution impl) {
        var arg1 = new int[]{3, 2, 4};
        var arg2 = 6;
        var exp = new int[]{1, 2};

        var res = Tests.when(impl, arg1, arg2);

        Tests.then(exp, res);
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example3(Solution impl) {
        var arg1 = new int[]{3, 3};
        var arg2 = 6;
        var exp = new int[]{0, 1};

        var res = Tests.when(impl, arg1, arg2);

        Tests.then(exp, res);
    }
}