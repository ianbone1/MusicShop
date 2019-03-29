package Shop.Accessories;

import Shop.ISell;
import Shop.ShopItem;

public class Book extends ShopItem implements ISell {

    private String author;
    private int pages;

    public Book(String name, String make, String model, double buyPrice, double sellPrice, String author, int pages) {
        super(name, make, model, buyPrice, sellPrice);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }

    public double markup() {
        return this.getSellPrice() - this.getBuyPrice();
    }

}
