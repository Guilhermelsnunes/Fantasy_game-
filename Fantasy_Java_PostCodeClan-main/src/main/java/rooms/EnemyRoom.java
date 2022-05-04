package rooms;

import enemies.Enemy;
import enemies.Orc;
import enemies.Troll;

public class EnemyRoom extends Room {

    private Enemy enemy;

    public EnemyRoom() {
        getRandomEnemy();
        setCanExit(false);
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void getRandomEnemy() {
        int result = getRandomNumber(2);
        if (result == 0) {
            this.enemy = new Orc(10);
        } else if (result == 1) {
            this.enemy = new Troll(10);
        }
    }
}