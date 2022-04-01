package Engine;
import Pets.Pet;

public class TeamsFight {

    private Pet[] teamA;
    private Pet[] teamB;

    public TeamsFight(Pet[] teamA, Pet[] teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
        System.out.println(teamsHavePets());
    }

    public void startTeamFight() {

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
                System.out.println("Draw");

            } else if (winnerPet.equals(avaliableA)){

                System.out.println("Wins team A: "+avaliableA.getClass().getName());
//                System.out.println("avaliableA stats: "+avaliableA.getHp());
//                System.out.println("winnerPet stats: "+winnerPet.getHp());
                teamB[indexB] = null;
                indexB += 1;

            } else if (winnerPet.equals(avaliableB)){

                System.out.println("Wins team B: "+avaliableB.getClass().getName());
//                System.out.println("avaliableB stats: "+avaliableB.getHp());
//                System.out.println("winnerPet stats: "+winnerPet.getHp());
//                System.out.println(teamB[0].getHp());
                teamA[indexA] = null;
                indexA += 1;

            }

        } while (teamsHavePets());

        // tmp - shows both teams
        System.out.println("\nTeams left:");
        System.out.println("Team A:");
        for (Pet pet: teamA) {
            System.out.print(pet+" ");
        }
        System.out.println();
        System.out.println("Team B:");
        for (Pet pet: teamB) {
            System.out.print(pet+" ");
        }

    }

    public Pet getFirstAvailablePet(Pet[] team) {
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
        boolean isFirstTeamAlive = teamHavePets(teamA);
        boolean isSecondTeamAlive = teamHavePets(teamB);
        return isFirstTeamAlive && isSecondTeamAlive;
    }

    private boolean teamHavePets(Pet[] team) {
        boolean teamIsAlive = false;
        for (Pet pet : team) {
            if (pet != null) {
                teamIsAlive = true;
                break;
            }
        }
        return teamIsAlive;
    }

}
