package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarNameTest {

    @Test
    void 자동차_이름_생성_테스트() {
        CarName actualCarName = new CarName("test");
        assertThat(actualCarName.getName()).isEqualTo("test");
    }
}
