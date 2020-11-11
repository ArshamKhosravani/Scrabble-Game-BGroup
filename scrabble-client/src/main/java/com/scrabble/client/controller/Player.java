package com.scrabble.client.controller;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private Map<Character, Integer> map = new HashMap<>();
    private int Score = 0;
    private long id;
    private String Pname;
    private boolean turn=false;

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public boolean isTurn() {
        return turn;
    }

    public Player(String pname, long id) {
        Pname = pname;
        this.id = id;
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('l', 1);
        map.put('u', 1);
        map.put('n', 1);
        map.put('s', 1);
        map.put('t', 1);
        map.put('r', 1);
        map.put('d', 2);
        map.put('g', 2);
        map.put('c', 3);
        map.put('b', 3);
        map.put('m', 3);
        map.put('p', 3);
        map.put('f', 4);
        map.put('h', 4);
        map.put('v', 4);
        map.put('w', 4);
        map.put('k', 5);
        map.put('j', 8);
        map.put('x', 8);
        map.put('z', 10);
        map.put('q', 10);
    }

}
