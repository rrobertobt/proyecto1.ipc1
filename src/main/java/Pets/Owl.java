package Pets;

public class Owl extends Pet implements Flying, Solitary{
    public Owl() {
        attack = 5;
        hp = 3;
        level = 1;
        xp = 1;
        tier = 3;
    }
}
