package Pets;

public class Rat extends Pet implements Solitary, Land{
    public Rat() {
        attack = 4;
        hp = 5;
        level = 1;
        xp = 1;
        tier = 2;
    }
}
