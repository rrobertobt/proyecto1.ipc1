package Engine;

import Engine.Players.*;
import Pets.*;
import Utils.*;

public class PreFight {

    PlayerUser player;
    int availableGold;
    int round;

    public PreFight(PlayerUser player) {
        this.player = player;
    }

    public void prepareFightMenu(Pet[] pets, int round) {

        int selection = 0;
        availableGold = 10;
        do {
            System.out.println("-- Jugando Modo arena --");
            System.out.println(String.format("Estas en la ronda: %s",round));
            System.out.println(String.format("Tienes: %s vidas", player.getLives()));
            System.out.println(String.format("Tienes: %s de oro disponible para gastar", availableGold));
            if (player.getWins() == 0) {
                System.out.println("No has ganando aun ninguna batalla");
            } else {
                System.out.println(String.format("Has ganado: %s batallas", player.getWins()));
            }
            System.out.println("Antes de comenzar una batalla puedes:\n" +
                    "1: Ver mi equipo de mascotas\n" +
                    "2: Comprar mascotas\n" +
                    "3: Ordenar mi equipo de mascotas\n" +
                    "4: Vender mascotas\n" +
                    "5: Comenzar la batalla con las mascotas actuales");
            System.out.print("Eleccion? > ");
            selection = InputHandler.askNumberRange(1,5);

            switch (selection){
                case 1:
                    System.out.println("Ver equipo");
                    showPets(player.getPlayerPets());
                    break;
                case 2:
                    System.out.println("Ver equipo");
                    break;
                case 3:
                    System.out.println("Ver equipo");
                    break;
                case 4:
                    System.out.println("Ver equipo");
                    break;
                case 5:
                    System.out.println("Ver equipo");
                    break;
            }
        } while (selection != 5);
    }

    private void showPets(Pet[] pets){
        int emptySlots = 0;
        for (int i = 0; i < player.getPlayerPets().length; i++) {
            if (pets[i] != null){
                System.out.println(String.format("Animal: %s | Ataque: %s | Daño: %s",pets[i].getName(),pets[i].getAttack(),pets[i].getHp()));
            }
        }
    }

}
