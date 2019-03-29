import Shop.Instrument.WoodWind;
import Shop.Instrument.WoodWindType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodWindTest {

    private WoodWind oboe;

    @Before
    public void setup(){
        oboe = new WoodWind("Oboe 1", "Oboe Maker", "Oboe Model", 300, 380,10, WoodWindType.OBOE);
    }

    @Test
    public void hasName() {
        assertEquals("Oboe 1", oboe.getName());
    }

    @Test
    public void hasType() {
        assertEquals(WoodWindType.OBOE, oboe.getType());
    }

    @Test
    public void play() {
        assertEquals("Oboe 1 is now playing", oboe.play());
    }

    @Test
    public void testmarkup() {
        assertEquals(80.0, oboe.markup(),0.0);
    }
}
