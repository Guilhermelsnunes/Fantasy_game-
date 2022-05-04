package treasure;

import enemies.Enemy;

public class Gold implements ITreasure{

    private int value;

    public Gold(){
        this.value = 30;
    }

    public int getValue(){
        return value;
    }
}


