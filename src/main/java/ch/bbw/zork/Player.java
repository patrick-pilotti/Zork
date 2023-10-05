package ch.bbw.zork;

import java.util.Arrays;

public class Player {
    private int hp;
    private String name;
    private int previousRoomId;
    private int currentRoomId;
    private Item[] inventory;

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

    public void addToInventory(Item item) {
        if (inventory == null) {
            inventory = new Item[]{item};
        } else {
            // Check if the item is already in the inventory
            if (!Arrays.asList(inventory).contains(item)) {
                // Create a new array with one more slot for the new item
                Item[] newInventory = Arrays.copyOf(inventory, inventory.length + 1);
                newInventory[inventory.length] = item;
                inventory = newInventory;
            }
        }
    }


    public Player(int hp, String name, int previousRoomId, int currentRoomId, Item[] inventory) {
        this.hp = hp;
        this.name = name;
        this.previousRoomId = previousRoomId;
        this.currentRoomId = currentRoomId;
        this.inventory = inventory;
    }
}
