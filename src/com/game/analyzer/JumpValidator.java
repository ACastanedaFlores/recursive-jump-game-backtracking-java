package com.game.analyzer;

/**
 * Utility class that uses backtracking to validate if a winning path of 
 * recursive jumps exists from the start to the end of a map.
 * 
 * @author Axel Castañeda
 */
public class JumpValidator {

    public boolean canWin(int[] map) {
        if (map == null || map.length == 0) {
            return false;
        }
        return canWin(map, 0);
    }
    
    private boolean canWin(int[] map, int currentPosition) {
        if (currentPosition == map.length - 1) {
            return true;
        }
        if (currentPosition >= map.length || map[currentPosition] == 0) {
            return false;
        }

        for (int i = 1; i <= map[currentPosition]; i++) {
            if (canWin(map, currentPosition + i)) {
                return true;
            }
        }
        return false;
    }
}
