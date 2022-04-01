package Pets;

public class Turkey extends Pet implements Land, Flying{
    public Turkey() {
        attack = 3;
        hp = 4;
        level = 1;
        xp = 1;
        tier = 5;
    }
}
