package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarNameTest {

    @Test
    void 이름은_5자리_이하만_가능_합니다() {
        
        assertThatThrownBy(() -> {
            CarName carName = new CarName("Park JeongHyeon");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Message.NAME_CAN_NOT_BE_MORE_THEN_5_DIGITS());
    }
}
