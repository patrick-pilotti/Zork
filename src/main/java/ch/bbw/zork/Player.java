package ch.bbw.zork;

public class Player {
    private int hp;
    private String name;
    private int previousRoomId;
    private int currentRoomId;
    private String[] inventory;

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

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    public Player(int hp, String name, int previousRoomId, int currentRoomId, String[] inventory) {
        this.hp = hp;
        this.name = name;
        this.previousRoomId = previousRoomId;
        this.currentRoomId = currentRoomId;
        this.inventory = inventory;
    }
}
