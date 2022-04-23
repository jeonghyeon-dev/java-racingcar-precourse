package racingcar;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarGroupTest {

    @Test
    void 자동차_그룹_생성_테스트() {

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("car1"),
                new Car("car2"),
                new Car("car3")));

        CarGroup carGroup = new CarGroup(cars);

        assertThat(carGroup.getCars().equals(cars)).isTrue();
    }

    @Test
    void 우승_자동차_그룹_테스트() {

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("car1"),
                new Car("car2"),
                new Car("car3")));

        ArrayList<Car> expectWinners = new ArrayList<>(Arrays.asList(
                new Car("car1"),
                new Car("car2")));

        cars.get(0).move(5);
        cars.get(1).move(5);

        expectWinners.get(0).move(5);
        expectWinners.get(1).move(5);

        CarGroup carGroup = new CarGroup(cars);
        ArrayList<Car> actualWinners = carGroup.getWinnerGroups();

        assertThat(actualWinners.equals(expectWinners)).isTrue();
    }
}
