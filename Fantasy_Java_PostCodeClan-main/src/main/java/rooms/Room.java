package rooms;

import java.util.ArrayList;

import java.util.Random;

public abstract class Room {


    private boolean canExit;

    public Room() {
        this.canExit = true;

    }

//setter
    public void setCanExit(boolean canExit) {
        this.canExit = canExit;
    }

//getter
    public boolean canExit() {
        return canExit;
    }


    public int getRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}