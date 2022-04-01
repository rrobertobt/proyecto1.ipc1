package Pets;

public class Frog extends Pet implements Land, Aquatic{
    public Frog() {
        attack = 3;
        hp = 3;
        level = 1;
        xp = 1;
        tier = 2;
    }
}
