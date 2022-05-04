import org.junit.Before;
import org.junit.Test;
import treasure.Gold;

import static org.junit.Assert.assertEquals;

public class GoldTest {

    Gold gold;

    @Before
    public void before(){
        gold = new Gold();
    }

    @Test
    public void hasValue(){
        assertEquals(30, gold.getValue());
    }
}
