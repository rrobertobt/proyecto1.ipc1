package Pets;

public class Peacock extends Pet implements Domestic, Flying{
    public Peacock() {
        attack = 2;
        hp = 5;
        level = 1;
        xp = 1;
        tier = 2;
    }
}
