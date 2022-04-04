package Engine.Players;
import Pets.*;

public class AiPlayer {

    Pet[] aiPlayerPets = new Pet[5];
    int round = 1;
    int lives = 10;
    int wins = 0;

    public Pet[] getAiPlayerPets() {
        return aiPlayerPets;
    }

    public void setAiPlayerPets(Pet pet, int index) {
        this.aiPlayerPets[index] = pet;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

}
