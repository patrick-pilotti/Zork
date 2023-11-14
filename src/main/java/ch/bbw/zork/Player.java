package ch.bbw.zork;

import java.util.Arrays;

public class Player {
    private int hp;
    private String name;
    private int previousRoomId;
    private int currentRoomId;
    private Item[] inventory;
    private int score;


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreviousRoomId() {
        return previousRoomId;
    }

    public void setPreviousRoomId(int previousRoomId) {
        this.previousRoomId = previousRoomId;
    }

    public int getCurrentRoomId() {
        return currentRoomId;
    }

    public void setCurrentRoomId(int currentRoomId) {
        this.currentRoomId = currentRoomId;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void takeDamage(int damage){
        hp = getHp() - damage;
    }

    public void addToInventory(Item item) {
        if (inventory == null) {
            inventory = new Item[]{item};
        } else {
            if (!Arrays.asList(inventory).contains(item)) {
                Item[] newInventory = Arrays.copyOf(inventory, inventory.length + 1);
                newInventory[inventory.length] = item;
                inventory = newInventory;
            }
        }
    }


    public Item findItemByName(String itemName) {
        if (inventory != null) {
            for (Item item : inventory) {
                if (item.getName().equalsIgnoreCase(itemName)) {
                    return item;
                }
            }
        }
        return null;
    }
    public Item findItemByIndex(int index) {
        if (index >= 0 && index < inventory.length) {
            return inventory[index];
        } else {
            return null;
        }
    }
    public void removeFromInventory(Item item) {
        if (inventory != null) {
            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i] == item) {
                    Item[] newInventory = new Item[inventory.length - 1];
                    for (int j = 0, k = 0; j < inventory.length; j++) {
                        if (j != i) {
                            newInventory[k] = inventory[j];
                            k++;
                        }
                    }
                    inventory = newInventory;
                    break;
                }
            }
        }
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player(int hp, String name, int previousRoomId, int currentRoomId, Item[] inventory, int score) {
        this.hp = hp;
        this.name = name;
        this.previousRoomId = previousRoomId;
        this.currentRoomId = currentRoomId;
        this.inventory = inventory;
        this.score = score;
    }
}
