package ch.bbw.zork;

public class Enemy {
    private String name;
    private int health;
    private int damage;

    private boolean isBoss;

    public Enemy() {
    }

    public Enemy(String name, int health, int damage, boolean isBoss) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.isBoss = isBoss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }
}
