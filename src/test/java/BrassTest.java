import Shop.Instrument.Brass;
import Shop.Instrument.BrassType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    private Brass bugle;

    @Before
    public void setup(){
        bugle = new Brass("Bugle name", "Bugle make", "Bugle model", 200, 260, 0,"Silver", BrassType.BUGLE);
    }

    @Test
    public void hasName() {
        assertEquals("Bugle name", bugle.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(200.0, bugle.getBuyPrice(),0.0);
    }

    @Test
    public void hasBrassType() {
        assertEquals(BrassType.BUGLE, bugle.getType());
    }

    @Test
    public void play() {
        assertEquals("Bugle name is now playing", bugle.play());
    }

    @Test
    public void testmarkup() {
        assertEquals(60.0, bugle.markup(),0.0);
    }

}

