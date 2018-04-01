package com.thoughtworks.tic_tac_toe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {

  private Game game;

  @Before
  public void setUp() throws Exception {
    game = new Game();
  }

  @Test
  public void shouldAddPlayer() {
    Players players = new Players();
    players.addPlayer("Ravinder");
    assertThat(game.addPlayer("Ravinder"), is(players));
  }

  @Test
  public void shouldAddPlayerMove() throws Exception {
    assertThat(game.addMove(1), is(Move.create(1)));
  }

  @Test
  public void shouldRemoveMoveFromGame() throws Exception {
    game.addMove(1);
    game.addMove(2);
    game.addMove(3);
    Moves expected = new Moves();
    expected.addMove(1);
    expected.addMove(3);
    assertThat(game.removeMove(2), is(expected));
  }
}
