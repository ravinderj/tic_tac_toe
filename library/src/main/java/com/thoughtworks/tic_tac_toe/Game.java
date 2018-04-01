package com.thoughtworks.tic_tac_toe;

public class Game {
  private Players players;
  private Moves moves;

  public Game() {
    this.players = new Players();
    this.moves = new Moves();
  }

  public Players addPlayer(String name) {
    this.players.addPlayer(name);
    return this.players;
  }

  public Move addMove(int move) throws Exception {
    this.players.addMove(move);
    return this.moves.addMove(move);
  }
}
