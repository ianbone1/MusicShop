import Shop.Instrument.Keyboard;
import Shop.Instrument.PowerType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    private Keyboard piano;

    @Before
    public void setup(){
        piano = new Keyboard("Piano 1", "Piano make", "Piano model", 1100.0, 1300.0, 128, PowerType.ACOUSTIC);
    }

    @Test
    public void hasName() {
        assertEquals("Piano 1", piano.getName());
    }

    @Test
    public void hasType() {
        assertEquals(PowerType.ACOUSTIC, piano.getType());
    }

    @Test
    public void play() {
        assertEquals("Piano 1 is now playing", piano.play());
    }

    @Test
    public void testMarkup() {
        assertEquals(200.0, piano.markup(),0.0);
    }
}
