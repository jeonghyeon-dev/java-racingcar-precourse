package racingcar;

public class CarName {
    public static final int MAX_LENGTH = 5;
    private final String name;

    public CarName() {
        name = "";
    }

    public CarName(String name) {
        validationLength(name);
        this.name = name;
    }

    private void validationLength(String name) {
        if(name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(Message.NAME_CAN_NOT_BE_MORE_THEN_5_DIGITS());
        }
    }

    public String getName() {
        return this.name;
    }
}
