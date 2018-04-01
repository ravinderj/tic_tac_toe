package com.thoughtworks.tic_tac_toe;

import java.util.Objects;

public class Move {
  private final int position;

  private Move(int position) {
    this.position = position;
  }
  public static Move create(int position) throws Exception {
    if(position < 1 && position < 9) {
      throw new Exception("invalid position");
    }
    return new Move(position);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Move move = (Move) o;
    return position == move.position;
  }

  @Override
  public int hashCode() {

    return Objects.hash(position);
  }

  @Override
  public String toString() {
    return "Move{" +
            "position=" + position +
            '}';
  }
}
