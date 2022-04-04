package Engine.Players;
import Pets.*;

public class PlayerUser {

    Pet[] playerPets = new Pet[5];
    int lives = 10;
    int wins = 0;

    public Pet[] getPlayerPets() {
        return playerPets;
    }

    public void setPlayerPets(Pet pet, int index) {
        this.playerPets[index] = pet;
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
