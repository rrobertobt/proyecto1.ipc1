import Pets.*;
import Engine.*;
import Utils.ArrayUtils;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Pet aPet = new Mosquito();
		Pet bPet = new Beaver();

		Pet[] teamA = new Pet[3];
		teamA[0] = new Beetle();
		teamA[1] = new Mosquito();
		teamA[2] = new Rat();
		Pet[] teamB = new Pet[3];
		teamB[0] = new Ant();
		teamB[1] = new Cricket();
		teamB[2] = new Dodo();

//		IndividualFight fight = new IndividualFight(aPet, bPet);
//		fight.startFight();
//		System.out.println(fight.startFight());
		TeamsFight tFight = new TeamsFight(ArrayUtils.cloner(teamA), ArrayUtils.cloner(teamB));
		tFight.startTeamFight();

		ArenaGame agame = new ArenaGame();
		agame.PlayArena();

//		Pet[] petsA = new Pet[3];
//		Pet[] petsB = new Pet[3];
//
//		petsA[0] = new Ant();
//		petsA[1] = new Cricket();
//		petsA[2] = new Mosquito();
//
//		petsB[0] = new Fish();
//		petsB[1] = new Horse();
//		petsB[2] = new Cricket();
//
//		if (petsA[0].getAttack() > petsB[0].getHp()) {
//			System.out.printf("B[0] dies");
//		} else if (petsB[0].getAttack() > petsA[0].getHp()) {
//			System.out.printf("A[0] dies");
//		}

	}

}
