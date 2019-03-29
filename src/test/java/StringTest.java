import Shop.Instrument.Stringed;
import Shop.Instrument.PowerType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {

    private Stringed guitar;

    @Before
    public void setup(){
        guitar = new Stringed("Guitar 1", "Gutar make", "Guitar model",400.0, 500.0, 5, PowerType.ELECTRIC);
    }

    @Test
    public void hasName() {
        assertEquals("Guitar 1", guitar.getName());
    }

    @Test
    public void hasType() {
        assertEquals(PowerType.ELECTRIC, guitar.getType());
    }

    @Test
    public void play() {
        assertEquals("Guitar 1 is now playing", guitar.play());
    }

    @Test
    public void testmarkup() {
        assertEquals(100.0, guitar.markup(),0.0);
    }

}
