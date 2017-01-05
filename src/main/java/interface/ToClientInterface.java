package interfaces;

import model.Game;
import model.GameState;

/**
 * Created by luke on 06.12.16.
 */
public interface ToClientInterface {

    void updateGame(GameState gameState);

}
