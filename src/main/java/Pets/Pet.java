package Pets;

public abstract class Pet {

    int attack;
    int hp;
    int level;
    int xp;
    int tier;

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

