import Shop.Accessories.Book;
import Shop.Accessories.GeneralAccessory;
import Shop.Instrument.*;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private GeneralAccessory drumstick;
    private Book sheet;
    private Brass bugle;
    private Keyboard piano;
    private Stringed guitar;
    private WoodWind oboe;


    @Before
    public void setup(){
        shop = new Shop("Sweet Tunes");
        drumstick = new GeneralAccessory("Drumstick 1", "Drumstick make", "Drumstick model", 20, 25,"Drumstick");
        sheet = new Book("Sheet Music", "Publisher", "Edition", 18, 23,"Ian Bone", 130);
        bugle = new Brass("Bugle name", "Bugle make", "Bugle model", 200, 260, 0,"Silver", BrassType.BUGLE);
        piano = new Keyboard("Piano 1", "Piano make", "Piano model", 1100.0, 1300.0, 128, PowerType.ACOUSTIC);
        guitar = new Stringed("Guitar 1", "Gutar make", "Guitar model",400.0, 500.0, 5, PowerType.ELECTRIC);
        oboe = new WoodWind("Oboe 1", "Oboe Maker", "Oboe Model", 300, 380,10, WoodWindType.OBOE);

    }

    @Test
    public void hasName() {
        assertEquals("Sweet Tunes", shop.getName());
    }

    @Test
    public void testEmptyStockCount() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void testAddStock() {
        shop.addStock(drumstick);
        shop.addStock(sheet);
        shop.addStock(bugle);
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.addStock(oboe);
        assertEquals(6, shop.stockCount());
    }

    @Test
    public void getProfirNoStock() {
        assertEquals(0.0, shop.getProfit(),0.0);
    }

    @Test
    public void getProfitWithStock() {
        shop.addStock(drumstick);
        shop.addStock(sheet);
        shop.addStock(bugle);
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.addStock(oboe);
        assertEquals(450.0, shop.getProfit(),0.0);
    }

    @Test
    public void canRemoveStockItem() {
        shop.addStock(drumstick);
        shop.addStock(sheet);
        shop.addStock(bugle);
        shop.addStock(piano);
        shop.addStock(guitar);
        shop.addStock(oboe);
        shop.removeStock(bugle);
        assertEquals(5, shop.stockCount());

    }
}
