package Pets;

public class Quetzal extends Pet implements Flying, Solitary{
    public Quetzal() {
        attack = 10;
        hp = 10;
        level = 1;
        xp = 1;
        tier = 7;
        name = "Quetzal";
    }
}
