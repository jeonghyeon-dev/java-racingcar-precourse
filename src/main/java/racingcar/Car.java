package racingcar;

import java.util.Objects;

public class Car implements Comparable<Car>{
    public static final int MIN_COUNT_MOVABLE = 4;
    private Name name;
    private int position;

    public Car() {
        this.name = new Name();
        this.position = 0;
    }

    public Car(String name) {
        this.name = new Name(name);
        this.position = 0;
    }

    public String getName() {
        return this.name.getName();
    }

    public void move(int moveCount) {
        if(isMovable(moveCount))
            this.position += 1;
    }

    private boolean isMovable(int moveCount) {
        return moveCount >= MIN_COUNT_MOVABLE;
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public int compareTo(Car other) {

        if(this.position > other.getPosition())
            return 1;
        if(this.position < other.getPosition())
            return -1;

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof Car))
            return false;
        Car otherCar = (Car)obj;
        return this.getName().equals(otherCar.getName()) && this.getPosition() == otherCar.getPosition();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
