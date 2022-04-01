package Pets;

public class Mammoth extends Pet implements Mammal, Land, Solitary{
    public Mammoth() {
        attack = 3;
        hp = 10;
        level = 1;
        xp = 1;
        tier = 6;
    }
}
