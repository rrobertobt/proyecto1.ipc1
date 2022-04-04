package Pets;

public abstract class Pet implements Cloneable{

    int attack;
    int hp;
    int level;
    int xp;
    int tier;
    String name;

    public int getAttack() { return attack; }

    public int getHp() { return hp; }

    public int getTier(){ return tier; }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    @Override
    public Pet clone() {
        try {
            return (Pet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

