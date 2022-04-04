package Engine;
import Pets.*;

public class IndividualFight {

    private Pet petA;
    private Pet petB;

    public IndividualFight(Pet petA, Pet petB) {
        this.petA = petA;
        this.petB = petB;
    }

    public Pet startFight(){

        System.out.println(petA.getClass().getSimpleName()+" fights with "+petB.getClass().getSimpleName());

        do {
            petA.setHp((petA.getHp() - petB.getAttack()));
            petB.setHp((petB.getHp() - petA.getAttack()));
        } while (noWinner());

        showWinner();

        // Return the winner pet or null if draw
        if (petA.getHp() > 0){
            return petA;
        } else if (petB.getHp() > 0) {
            return petB;
        } else {
            return null;
        }
    }

    private boolean noWinner() { return petA.getHp() > 0 && petB.getHp() > 0; }

    public void showWinner(){
        if (petA.getHp() > 0){
            System.out.println("Wins "+petA.getClass().getSimpleName());
        } else if (petB.getHp() > 0) {
            System.out.println("Wins "+petB.getClass().getSimpleName());
        } else {
            System.out.println("No winner, both died");
        }
    }

    public Pet getWinner(){
        if (petA.getHp() > 0){
            return petA;
        } else if (petB.getHp() > 0) {
            return petB;
        } else {
            return null;
        }

    }
}
