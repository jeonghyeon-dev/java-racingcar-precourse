package racingcar;

import org.junit.platform.commons.util.StringUtils;

public class GameCount {

    private static int gameCount;

    public GameCount(String gameCount) {
        try{
            validationForGameCountType(gameCount);
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println(illegalArgumentException.getMessage());
            return;
        }
        this.gameCount = Integer.parseInt(gameCount);
    }

    public GameCount() {
        this.gameCount = 0;
    }

    private void validationForGameCountType(String gameCount) {
        if(!gameCount.chars().allMatch(Character :: isDigit));
            throw new IllegalArgumentException(Message.getGameCountMustBeDigits());
    }
}
