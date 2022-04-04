package Engine;
import Pets.*;

public class TeamsFight {

    private Pet[] teamA;
    private Pet[] teamB;

    public TeamsFight(Pet[] teamA, Pet[] teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void startTeamFight() throws CloneNotSupportedException {

        int indexA = 0;
        int indexB = 0;

        do {

            Pet avaliableA = getFirstAvailablePet(teamA);
            Pet avaliableB = getFirstAvailablePet(teamB);

            IndividualFight fight = new IndividualFight(avaliableA, avaliableB);
            Pet winnerPet = fight.startFight();


            if (winnerPet == null) {

                teamA[indexA] = null;
                indexA += 1;
                teamB[indexB] = null;
                indexB += 1;
//                System.out.println("Draw");

            } else if (winnerPet.equals(avaliableA)){

                System.out.println(String.format("Ha ganado la mascota del equipo A: %s",avaliableA.getClass().getSimpleName()));
                teamB[indexB] = null;
                indexB += 1;

            } else if (winnerPet.equals(avaliableB)){

                System.out.println(String.format("Ha ganado la mascota del equipo B: %s",avaliableB.getClass().getSimpleName()));
                teamA[indexA] = null;
                indexA += 1;

            }

        } while (teamsHavePets());

        showFinalStats();

    }

    public Pet getFirstAvailablePet(Pet[] team) throws CloneNotSupportedException {
        Pet available = null;

        for (Pet pet : team) {
            if (pet != null) {
                available = pet;
                break;
            }
        }
        return available;
    }

    private boolean teamsHavePets() {
        boolean isFirstTeamAlive = teamHasPets(teamA);
        boolean isSecondTeamAlive = teamHasPets(teamB);
        return isFirstTeamAlive && isSecondTeamAlive;
    }

    private boolean teamHasPets(Pet[] team) {
        boolean teamIsAlive = false;
        for (Pet pet : team) {
            if (pet != null) {
                teamIsAlive = true;
                break;
            }
        }
        return teamIsAlive;
    }

    private void showFinalStats(){
        int leftPets = 0;
        Pet[] winnerTeam = null;
        //show winner team
        if (teamHasPets(teamA)){
            System.out.println("El equipo A ha ganado esta ronda!");
            winnerTeam = teamA;
        } else if (teamHasPets(teamB)){
            System.out.println("El equipo B ha ganado esta ronda!");
            winnerTeam = teamB;
        } else {
            System.out.println("Empate!");
        }

        if (winnerTeam == teamA){
            for (Pet pet:winnerTeam) {
                if (pet != null){leftPets += 1;}
            }
            System.out.println(String.format("En el equipo ganador A han sobrevivido %s mascotas:",leftPets));

            for (Pet pet : winnerTeam) {
                if (pet != null) {
                    System.out.println(String.format("Animal: %s | Ataque: %s | Vida: %s", pet.getName(), pet.getAttack(), pet.getHp()));
                }
            }
        } else if (winnerTeam == teamB){
            for (Pet pet:winnerTeam) {
                if (pet != null){leftPets += 1;}
            }
            System.out.println(String.format("En el equipo ganador B han sobrevivido %s mascotas:",leftPets));

            for (Pet pet : winnerTeam) {
                if (pet != null) {
                    System.out.println(String.format("Animal: %s | Ataque: %s | Vida: %s", pet.getName(), pet.getAttack(), pet.getHp()));
                }
            }

        }

    }

}
