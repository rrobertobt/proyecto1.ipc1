package Engine;

import Utils.InputHandler;

public class MainMenu {

    private void greeter() {
        System.out.println("Bienvenid@ a");
        System.out.println("""
                   _____                                       _          _____     _      \s
                  / ____|                           /\\        | |        |  __ \\   | |     \s
                 | (___  _   _ _ __   ___ _ __     /  \\  _   _| |_ ___   | |__) |__| |_ ___\s
                  \\___ \\| | | | '_ \\ / _ \\ '__|   / /\\ \\| | | | __/ _ \\  |  ___/ _ \\ __/ __|
                  ____) | |_| | |_) |  __/ |     / ____ \\ |_| | || (_) | | |  |  __/ |_\\__ \\
                 |_____/ \\__,_| .__/ \\___|_|    /_/    \\_\\__,_|\\__\\___/  |_|   \\___|\\__|___/
                              | |                                                          \s
                              |_|                                                          \s
                """);
    }

    public void startGame() throws CloneNotSupportedException {
        greeter();
        mainMenu();
    }

    public void mainMenu() throws CloneNotSupportedException {
        int selection = 0;
        while (2 != selection) {
            System.out.println("#### MENU PRINCIPAL ####");
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1: Correr demo de modo arena");
            System.out.println("2: Salir del juego");
            System.out.print("Eleccion? > ");
            selection = InputHandler.askNumberRange(1, 2);
            checkOption(selection);
        }
    }

    private void checkOption(int selection) throws CloneNotSupportedException {
        switch (selection) {
            case 1:
                ArenaGame agame = new ArenaGame();
                agame.PlayArena();
                break;
            case 2:
                System.out.println("Saliendo del juego...");
                System.exit(0);
                break;
        }
    }

}
