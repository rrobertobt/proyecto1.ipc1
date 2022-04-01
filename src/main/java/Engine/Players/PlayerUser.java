package Engine.Players;
import Pets.*;

public class PlayerUser extends Player {

    Pet[] playerPets;
    int round = 1;
    int lives = 10;
    int wins = 0;

    public Pet[] getPlayerPets() {
        return playerPets;
    }

    public void setPlayerPets(Pet[] playerPets) {
        this.playerPets = playerPets;
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
