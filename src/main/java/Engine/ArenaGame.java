package Engine;
import Engine.Players.*;
import Pets.*;

public class ArenaGame {

    PlayerUser playerUser = new PlayerUser();

    AiPlayer ai = new AiPlayer();
    PreFight preparator = new PreFight(playerUser);
    int round = 1;


    public void PlayArena(){

        playerUser.setPlayerPets(new Ant(),0);

        while (playerCanPlay()){
//            System.out.println("Player can play");
            preparator.prepareFightMenu(playerUser.getPlayerPets(),round);
        }

    }

    private boolean playerCanPlay(){
        return playerUser.getLives() > 0 && playerUser.getWins() <= 10;
    }



}
