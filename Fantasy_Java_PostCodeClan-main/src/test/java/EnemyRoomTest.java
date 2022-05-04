import enemies.Orc;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import rooms.EnemyRoom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;

    @Before
    public void before(){
        enemyRoom = new EnemyRoom ();
    }


    @Test
    public void hasMonster(){
        assertNotNull(enemyRoom.getEnemy());
    }

    @Test
    public void canNotExit(){
        assertEquals(false, enemyRoom.canExit());
    }


}
