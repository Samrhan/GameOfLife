package org.carbon.utils;

import org.carbon.model.GameState;

public class ConsolePrinter implements Printer {
    public void displayGameState(GameState gameState) {
        for (int x = 0; x < gameState.grid().size(); x++) {
            for (int y = 0; y < gameState.grid().get(x).size(); y++) {
                System.out.print(gameState.getCell(x, y) ? "X" : " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
}
