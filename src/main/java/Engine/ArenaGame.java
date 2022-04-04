package Engine;
import Engine.Players.*;
import Pets.*;
import Utils.ArrayUtils;

public class ArenaGame {

    PlayerUser playerUser = new PlayerUser();

    AiPlayer ai = new AiPlayer();
    PreFight preparator = new PreFight(playerUser);
    int round = 1;


    public void PlayArena() throws CloneNotSupportedException {

        while (playerKeepPlaying()){
            selectBattles();
            preparator.prepareFightMenu(playerUser.getPlayerPets(),round);
            TeamsFight tFight = new TeamsFight(ArrayUtils.cloner(playerUser.getPlayerPets()),ArrayUtils.cloner(ai.getAiPlayerPets()));
            tFight.startTeamFight();
            preparator.selection = 0;
        }

    }

    private boolean playerKeepPlaying(){
        return preparator.selection != 1;

    }

    private void selectBattles(){
        int random_int = (int)Math.floor(Math.random()*(3-1+1)+1);

        if (random_int == 1){battle1();}
        else if (random_int == 2){battle2();}
        else if (random_int == 3){battle3();}

    }

    private void battle1(){
        playerUser.setPlayerPets(new Fish(), 0);
        playerUser.setPlayerPets(new Cricket(), 1);
        playerUser.setPlayerPets(new Mosquito(), 2);
        playerUser.setPlayerPets(new Otter(), 3);
        playerUser.setPlayerPets(new Frog(), 4);

        ai.setAiPlayerPets(new Beetle(),0);
        ai.setAiPlayerPets(new Dodo(),1);
        ai.setAiPlayerPets(new Elephant(),2);
        ai.setAiPlayerPets(new Cricket(),3);
        ai.setAiPlayerPets(new Mosquito(),4);
    }
    private void battle2(){
        playerUser.setPlayerPets(new Camel(), 0);
        playerUser.setPlayerPets(new Rat(), 1);
        playerUser.setPlayerPets(new Raccoon(), 2);
        playerUser.setPlayerPets(new Giraffe(), 3);
        playerUser.setPlayerPets(new Sheep(), 4);

        ai.setAiPlayerPets(new Snail(),0);
        ai.setAiPlayerPets(new Dodo(),1);
        ai.setAiPlayerPets(new Turtle(),2);
        ai.setAiPlayerPets(new Wolf(),3);
        ai.setAiPlayerPets(new Ox(),4);

    }
    private void battle3(){
        playerUser.setPlayerPets(new Fox(), 0);
        playerUser.setPlayerPets(new Ox(), 1);
        playerUser.setPlayerPets(new Kangaroo(), 2);
        playerUser.setPlayerPets(new Deer(), 3);
        playerUser.setPlayerPets(new Parrot(), 4);

        ai.setAiPlayerPets(new Hipo(),0);
        ai.setAiPlayerPets(new Dolphin(),1);
        ai.setAiPlayerPets(new Cougar(),2);
        ai.setAiPlayerPets(new Jaguar(),3);
        ai.setAiPlayerPets(new Llama(),4);

    }



}
