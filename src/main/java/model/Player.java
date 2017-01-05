package model;

import java.util.Set;

/**
 * Created by pawel on 05.01.17.
 */
public class Player {
    private String name;
    private Integer points;
    private Set<Integer> dice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Set<Integer> getDice() {
        return dice;
    }

    public void setDice(Set<Integer> dice) {
        this.dice = dice;
    }

    public Player(String name, Integer points, Set<Integer> dice) {

        this.name = name;
        this.points = points;
        this.dice = dice;
    }
}
