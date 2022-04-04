package Utils;

import Pets.Pet;

public class ArrayUtils {

    public static Pet[] cloner(Pet[] pets) {
        Pet[] clonedPets = new Pet[pets.length];
        for (int i = 0; i < pets.length; i++) {
            clonedPets[i] = pets[i].clone();
        }
        return clonedPets;
    }
}
