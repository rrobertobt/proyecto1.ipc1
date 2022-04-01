package Pets;

public class Fly extends Pet implements Flying, Insect{
    public Fly() {
        attack = 5;
        hp = 5;
        level = 1;
        xp = 1;
        tier = 6;
    }
}
