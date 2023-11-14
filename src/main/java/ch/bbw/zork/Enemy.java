package ch.bbw.zork;

public class Enemy {
    private String name;
    private int health;
    private int damage;

    private boolean isBoss;
    private String Description;

    public Enemy() {
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
    public void takeDamage(int damage){
        health = getHealth() - damage;
    }

    public Enemy(String name, int health, int damage, boolean isBoss, String description) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.isBoss = isBoss;
        this.Description = description;
    }


    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        Description = Description;
    }


}
