package Pets;

public class Sheep extends Pet implements Domestic, Land{
    public Sheep() {
        attack = 2;
        hp = 2;
        level = 1;
        xp = 1;
        tier = 3;
        name = "Oveja";
    }
}
