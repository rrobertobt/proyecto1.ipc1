package Pets;

public class Snake extends Pet implements Reptile, Land, Dessert{
    public Snake() {
        attack = 6;
        hp = 6;
        level = 1;
        xp = 1;
        tier = 6;
    }
}
