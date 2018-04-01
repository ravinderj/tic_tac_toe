package com.thoughtworks.tic_tac_toe;

public class Game {
  private Players players;

  public Game() {
    this.players = new Players();
  }

  public Players addPlayer(String name) {
    this.players.addPlayer(name);
    return this.players;
  }
}
