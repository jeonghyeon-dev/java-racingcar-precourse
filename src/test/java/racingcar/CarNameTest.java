package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarNameTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void 이름은_5자리_이하만_가능_합니다() {
        System.setOut(new PrintStream(outputStreamCaptor));
        CarName carName = new CarName("Park JeongHyeon");
        assertEquals(Message.getNameCanNotBeMoreThen5Digits(), outputStreamCaptor.toString()
                .trim());
    }
}
