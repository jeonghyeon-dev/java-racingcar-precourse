package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarGroupTest {

    @Test
    void 자동차_추가_테스트() {
        CarGroup actualCarGroup = new CarGroup();
        actualCarGroup.addCar("test");

        assertThat(actualCarGroup.getCars().get(0)).isEqualTo(new Car("test"));
    }

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

    @Test
    void 자동차_이동_테스트() {

        CarGroup actualGroup = new CarGroup();

        actualGroup.addCar("car1");
        actualGroup.addCar("car2");
        actualGroup.addCar("car3");

        actualGroup.move(5);

        CarGroup expectGroup = new CarGroup();

        expectGroup.addCar("car1");
        expectGroup.addCar("car2");
        expectGroup.addCar("car3");

        for(Car car : expectGroup.getCars()){
            car.move(5);
        }

        assertThat(actualGroup.getCars().equals(expectGroup.getCars())).isTrue();
    }
}
