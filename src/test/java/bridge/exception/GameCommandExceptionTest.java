package bridge.exception;

import bridge.helper.TestData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameCommandExceptionTest {

    UserException gameCommandException = new GameCommandException();

    @ParameterizedTest
    @DisplayName("R, Q 이외의 값을 입력하면 예외를 반환한다.")
    @MethodSource("generateData")
    void isNotGameCommandTest(String errorGameCommand) {
        assertThrows(IllegalArgumentException.class, () -> gameCommandException.checkException(errorGameCommand));
    }

    static List<String> generateData() {
        return TestData.generateExceptionData(81, 82);
    }
}
