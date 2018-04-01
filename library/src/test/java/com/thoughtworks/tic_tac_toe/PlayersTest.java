package com.thoughtworks.tic_tac_toe;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PlayersTest {
  @Test
  public void shouldAddPlayer() {
    Players players = new Players();
    List<Player> actual = players.addPlayer("Ravinder");
    ArrayList<Object> expected = new ArrayList<>();
    expected.add(new Player("Ravinder"));
    assertThat(actual, is(expected));
  }
}