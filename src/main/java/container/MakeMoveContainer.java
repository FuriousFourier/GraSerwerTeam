package container;

import model.Move;

import java.io.Serializable;

/**
 * Created by pawel on 05.01.17.
 */
public class MakeMoveContainer implements Serializable {
    private String nick;
    private Move move;

    public MakeMoveContainer(String nick, Move move) {
        this.nick = nick;
        this.move = move;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }
}
