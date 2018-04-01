package com.thoughtworks.tic_tac_toe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MovesTest {
  @Test
  public void shouldAddMove() throws Exception {
    Moves moves = new Moves();
    assertThat(moves.addMove(2), is(Move.create(2)));
  }
}