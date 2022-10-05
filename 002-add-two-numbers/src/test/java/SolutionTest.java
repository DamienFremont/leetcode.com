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
        var arg1 = new int[]{2, 4, 3};
        var arg2 = new int[]{5, 6, 4};
        var exp = new int[]{7, 0, 8};

        var res = Tests.when(impl, arg1, arg2);

        Tests.then(exp, res);
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example2(Solution impl) {
        var arg1 = new int[]{0};
        var arg2 = new int[]{0};
        var exp = new int[]{0};

        var res = Tests.when(impl, arg1, arg2);

        Tests.then(exp, res);
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example3(Solution impl) {
        var arg1 = new int[]{9, 9, 9, 9, 9, 9, 9};
        var arg2 = new int[]{9, 9, 9, 9};
        var exp = new int[]{8, 9, 9, 9, 0, 0, 0, 1};

        var res = Tests.when(impl, arg1, arg2);

        Tests.then(exp, res);
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example33(Solution impl) {
        var arg1 = new int[]{9};
        var arg2 = new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        var exp = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

        var res = Tests.when(impl, arg1, arg2);

        Tests.then(exp, res);
    }

    @ParameterizedTest
    @MethodSource("provideImpl")
    void example1566(Solution impl) {
        var arg1 = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        var arg2 = new int[]{5, 6, 4};
        var exp = new int[]{6, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

        var res = Tests.when(impl, arg1, arg2);

        Tests.then(exp, res);
    }
}