package Pets;

public class Wolf extends Pet implements Solitary, Land{
    public Wolf() {
        attack = 3;
        hp = 4;
        level = 1;
        xp = 1;
        tier = 3;
        name = "Lobo";
    }
}
