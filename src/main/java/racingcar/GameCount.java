package racingcar;

import org.junit.platform.commons.util.StringUtils;

public class GameCount {

    private static int gameCount;

    public GameCount() {
        this.gameCount = 0;
    }

    public boolean setGameCount(String gameCount) {
        try {
            validationForGameCountType(gameCount);
            this.gameCount = Integer.parseInt(gameCount);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return false;
        }
        return true;
    }

    public static int getGameCount() {
        return gameCount;
    }

    private void validationForGameCountType(String gameCount) throws IllegalArgumentException {
        if (!gameCount.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException(Message.getGameCountMustBeDigits());
        }
    }
}
