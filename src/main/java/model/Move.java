package model;

import java.util.List;

/**
 * Created by pawel on 05.01.17.
 */
public class Move {
    private List<Integer> dice;

    public List<Integer> getDice() {
        return dice;
    }

    public void setDice(List<Integer> dice) {
        this.dice = dice;
    }

    public Move(List<Integer> dice) {

        this.dice = dice;
    }
}
