package com.thoughtworks.tic_tac_toe;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Players {
  private final List<Player> list;

  public Players() {
    this.list = new ArrayList<Player>();
  }

  public List<Player> addPlayer(String name) {
    Player player = new Player(name);
    this.list.add(player);
    return this.list;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Players players = (Players) o;
    return Objects.equals(list, players.list);
  }

  @Override
  public int hashCode() {

    return Objects.hash(list);
  }
}
