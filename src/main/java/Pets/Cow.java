package Pets;

public class Cow extends Pet implements Mammal, Land{
    public Cow() {
        attack = 4;
        hp = 6;
        level = 1;
        xp = 1;
        tier = 5;
    }
}
