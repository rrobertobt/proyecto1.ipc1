package Pets;

public class Snail extends Pet implements Insect, Solitary{
    public Snail() {
        attack = 2;
        hp = 2;
        level = 1;
        xp = 1;
        tier = 3;
    }
}
