package com.thoughtworks.tic_tac_toe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {
  @Test
  public void shouldAddPlayer() {
    Game game = new Game();
    Players players = new Players();
    players.addPlayer("Ravinder");
    assertThat(game.addPlayer("Ravinder"), is(players));
  }

  @Test
  public void shouldAddPlayerMove() throws Exception {
    Game game = new Game();
    assertThat(game.addMove(1), is(Move.create(1)));
  }
}
