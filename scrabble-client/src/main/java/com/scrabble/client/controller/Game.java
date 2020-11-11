package com.scrabble.client.controller;

import java.util.HashMap;
import java.util.Map;

public class Game {
    public static char[][] cell = new char[15][15];
    Player p;
    Map<Character, Integer> map = new HashMap<>();
    Player[] players = new Player[4];

    public void setPlayers(Player[] p) {
        if (p.length > 1 && p.length <= 4)
            for (int i = 0; i < p.length; i++) {
                players[i] = p[i];
            }
    }

    public Player[] getPlayers() {
        return players;
    }

    public void table(char a[][]) {
        cell = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = ' ';
            }
        }
    }

    public char[][] getTable() {
        return cell;
    }

    public static boolean isFull(int x, int y) {

        if (x <= cell.length && x >= 0 && y <= cell[0].length && y >= 0) {

            if (cell[x][y] != ' ')
                return true;
        }
        return false;
    }

    public void setWordsValue() {

    }


    public void score(int x, int y) {//Its not complete
        int value = 0;
        if (isFull(x, y)) {
            if (x == 0 && y == 0 || x == 7 && y == 0 || x == 0 && y == 14 || x == 0 && y == 7 || x == 14 && y == 7 || x == 0 && y == 14 || x == 7 && y == 14 || x == 14 && y == 14) {

            }
        }
    }

    public void putWords(char c, int x, int y) {
        if (!isFull(x, y) && map.containsKey(c))
            cell[x][y] = c;
    }

    public boolean endGame() {

    }

    public void turn() {
        while (!endGame()) {
            for (int i = 0; i < players.length; i++) {
                players[i].setTurn(true);
                if (i > 0)//for avoiding ArrayIndexOutOfBoundsException
                    players[i - 1].setTurn(false);
            }
        }
    }
}
