package Engine;

import Engine.Players.*;
import Pets.*;
import Utils.*;

public class PreFight {

    MainMenu mainMenu = new MainMenu();
    PlayerUser player;
    int availableGold;
    int selection = 0;

    public PreFight(PlayerUser player) {
        this.player = player;
    }

    public void prepareFightMenu(Pet[] pets, int round) throws CloneNotSupportedException {

        availableGold = 10;
        while (1 != selection) {
            System.out.println("\n#### JUGANDO MODO ARENA ####");
            System.out.println("(Aviso: Este modo de juego esta incompleto, \nsolo se efectuaran batallas generadas aleatoriamente hasta que se desee salir)\n");
            System.out.println("Que deseas hacer?:\n" +
                    "1: Ser espectador de una pelea demo\n" +
                    "2: Salir de este modo\n");

            System.out.print("Eleccion? > ");
            selection = InputHandler.askNumberRange(1, 2);
            checkOption(selection);
        }
    }

    private void checkOption(int selection) throws CloneNotSupportedException {
        switch (selection) {
            case 1:
                System.out.println("Mostrando pelea...");
                break;
            case 2:
                System.out.println("Regresando a menu principal...");
                mainMenu.startGame();
                break;
        }
    }

    private void showPets(Pet[] pets) {
        if (ArrayUtils.isEmpty(pets)){
            System.out.println("|| No tienes mascotas en tu equipo! ||");
        } else {
            System.out.println("|| Tu equipo tiene las mascotas: ||");
            for (int i = 0; i < player.getPlayerPets().length; i++) {
                if (pets[i] != null) {
                    System.out.println(String.format("\t|| Animal: %s | Ataque: %s | Vida: %s ||", pets[i].getName(), pets[i].getAttack(), pets[i].getHp()));
                }
            }
        }
    }

}
