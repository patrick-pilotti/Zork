package ch.bbw.zork;

public class Item {
    private String name;
    private String description;
    private double damage;
    private int durability;
    private double weight;
    private String[] perks;
    private int hp;

    public Item(){
    }

    public Item(String name, String description, double damage, int durability, double weight, String[] perks, int hp){
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.durability = durability;
        this.weight = weight;
        this.perks = perks;
        this.hp = hp;
    }

    public String getName(){
        return name;
    }

    public Item setName(String name){
        this.name = name;
        return this;
    }

    public String getDescription(){
        return description;
    }

    public Item setDescription(String description){
        this.description = description;
        return this;
    }

    public double getDamage(){
        return damage;
    }

    public Item setDamage(double damage){
        this.damage = damage;
        return this;
    }

    public int getDurability(){
        return durability;
    }

    public Item setDurability(int durability){
        this.durability = durability;
        return this;
    }

    public double getWeight(){
        return weight;
    }

    public Item setWeight(double weight){
        this.weight = weight;
        return this;
    }

    public String[] getPerks(){
        return perks;
    }

    public Item setPerks(String[] perks){
        this.perks = perks;
        return this;
    }

    public int getHp(){
        return hp;
    }

    public Item setHp(int hp){
        this.hp = hp;
        return this;
    }

}
