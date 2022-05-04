import org.junit.Before;
import org.junit.Test;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TreasureRoomTest {


    TreasureRoom treasureRoom;

    @Before
    public void Before() {
        treasureRoom = new TreasureRoom();
    }

    @Test
    public void hasTreasure(){
        assertNotNull(treasureRoom.getTreasure());
    }

    @Test
    public void canNotExit(){
        assertEquals(false, treasureRoom.canExit());
    }




}
