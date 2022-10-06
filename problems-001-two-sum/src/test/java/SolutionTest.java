import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class SolutionTest {

    private static Stream<Arguments> provideImpl() {
        return Stream.of(
                Arguments.of(new Solution())
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
}