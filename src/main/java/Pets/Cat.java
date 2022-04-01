package Pets;

public class Cat extends Pet implements Mammal, Domestic{
    public Cat() {
        attack = 4;
        hp = 5;
        level = 1;
        xp = 1;
        tier = 6;
    }
}
