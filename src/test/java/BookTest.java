import Shop.Accessories.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book sheet;

    @Before
    public void setup(){
        sheet = new Book("Sheet Music", "Publisher", "Edition", 18, 23,"Ian Bone", 130);
    }

    @Test
    public void hasName() {
        assertEquals("Sheet Music", sheet.getName());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Ian Bone", sheet.getAuthor());
    }

    @Test
    public void hasPages() {
        assertEquals(130, sheet.getPages());
    }

    @Test
    public void testmarkup() {
        assertEquals(5.0, sheet.markup(),0.0);
    }



}
