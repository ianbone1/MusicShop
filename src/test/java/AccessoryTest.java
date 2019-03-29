import Shop.Accessories.GeneralAccessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {


    private GeneralAccessory drumstick;

    @Before
    public void setup(){
        drumstick = new GeneralAccessory("Drumstick 1", "Drumstick make", "Drumstick model", 20, 25,"Drumstick");
    }

    @Test
    public void hasName() {
        assertEquals("Drumstick 1", drumstick.getName());
    }

    @Test
    public void hasType() {

        assertEquals("Drumstick", drumstick.getType());
    }

    @Test
    public void testmarkup() {
        assertEquals(5.0, drumstick.markup(),0.0);
    }
}
