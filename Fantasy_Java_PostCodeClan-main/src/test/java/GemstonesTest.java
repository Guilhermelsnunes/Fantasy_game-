import org.junit.Before;
import org.junit.Test;
import treasure.Gemstones;

import static org.junit.Assert.assertEquals;

public class GemstonesTest {

    Gemstones gemstones;

    @Before
    public void before(){
        gemstones = new Gemstones();
    }

    @Test
    public void hasValue(){
        assertEquals(50, gemstones.getValue());
    }
}
