package com.thoughtworks.tic_tac_toe;

import java.util.HashSet;

public class Moves extends HashSet {
  public Moves() {
    super();
  }

  public Move addMove(int number) throws Exception {
    Move move = Move.create(number);
    super.add(move);
    return move;
  }
}
