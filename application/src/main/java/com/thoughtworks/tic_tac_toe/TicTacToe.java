//package com.thoughtworks.tic_tac_toe;
//
//import java.util.Scanner;
//
//public class TicTacToe {
//  public static void main(String[] args) {
//    Game game = new Game();
//    addPlayers(game);
//  }
//
//  private static void addPlayers(Game game) {
//    char [] symbols = new char[]{'X','O'};
//    for (int count = 0; count < 2; count++) {
//      Scanner scanner = new Scanner(System.in);
//      String playerName = scanner.nextLine();
//      char playerSymbol = symbols[count];
//      game.addPlayer(playerName, playerSymbol);
//    }
//  }
//}
