package Pets;

public class Octopus extends Pet implements Aquatic, Solitary{
    public Octopus() {
        attack = 8;
        hp = 8;
        level = 1;
        xp = 1;
        tier = 6;
        name = "Pulpo";
    }
}
