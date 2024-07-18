package org.carbon;

import org.carbon.configurations.InitialConfiguration;
import org.carbon.model.GameState;
import org.carbon.service.GameService;
import org.carbon.utils.ConsolePrinter;
import org.carbon.utils.Printer;

import java.util.Scanner;

public class Main {

    private final Printer printer;
    private final GameService gameService;

    public static void main(String[] args) {
        Printer display = new ConsolePrinter();
        GameService gameController = new GameService();
        Main main = new Main(display, gameController);

        main.run(InitialConfiguration.getBeacon());
    }

    public Main(Printer display, GameService gameService) {
        this.printer = display;
        this.gameService = gameService;
    }

    public void run(GameState initialGameState) {
        printer.displayGameState(initialGameState);

        Scanner scanner = new Scanner(System.in);

        GameState gameState = initialGameState;
        while (true) {
            System.out.println("Press enter to calculate next generation or type 'stop' to stop the game");
            String input = scanner.nextLine();
            if ("stop".equalsIgnoreCase(input)) {
                break;
            }
            gameState = gameService.nextGeneration(gameState);
            printer.displayGameState(gameState);
        }
        scanner.close();
    }
}