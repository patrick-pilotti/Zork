package ch.bbw.zork;

public class Item {
    private String name;
    private String description;
    private float damage;
    private int durability;
    private float weight;
    private String[] perks;

    public Item() {
    }

    public Item(String name, String description, float damage, int durability, float weight, String[] perks) {
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.durability = durability;
        this.weight = weight;
        this.perks = perks;
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

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String[] getPerks() {
        return perks;
    }

    public void setPerks(String[] perks) {
        this.perks = perks;
    }
}
