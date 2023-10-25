package ch.bbw.zork;

public class Item {
    private String name;
    private String description;
    private double damage;
    private int durability;
    private double weight;
    private String[] perks;
    private int hp;
    private boolean hasStar;

    public Item() {
    }

    public Item(String name, String description, double damage, int durability, double weight, String[] perks, int hp, boolean hasStar) {
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.durability = durability;
        this.weight = weight;
        this.perks = perks;
        this.hp = hp;
        this.hasStar = hasStar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String[] getPerks() {
        return perks;
    }

    public void setPerks(String[] perks) {
        this.perks = perks;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isHasStar() {
        return hasStar;
    }

    public void setHasStar(boolean hasStar) {
        this.hasStar = hasStar;
    }


}
