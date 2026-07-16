package com.game.analyzer;

/**
 * Test harness to demonstrate and evaluate the backtracking logic 
 * of the recursive jump game under multiple path scenarios.
 * 
 * @author Axel Castañeda
 */
public class Main {

    public static void main(String[] args) {
        JumpValidator validator = new JumpValidator();

        int[] map1 = {2, 3, 0, 1, 4};
        System.out.println("Map 1 (Should be true): " + validator.canWin(map1));

        int[] map2 = {3, 2, 1, 0, 4};
        System.out.println("Map 2 (Should be false): " + validator.canWin(map2));
    }

}
