package Pets;

public class Panda extends Pet implements Mammal, Solitary{
    public Panda() {
        attack = 5;
        hp = 5;
        level = 1;
        xp = 1;
        tier = 6;
        name = "Panda";
    }
}
