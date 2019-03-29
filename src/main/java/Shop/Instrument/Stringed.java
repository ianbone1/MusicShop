package Shop.Instrument;

import Shop.IPlay;
import Shop.ISell;
import Shop.ShopItem;

public class Stringed extends ShopItem implements IPlay, ISell {

    private int numStrings;
    private PowerType type;

    public Stringed(String name, String make, String model, double buyPrice, double sellPrice, int numStrings, PowerType type) {
        super(name, make, model, buyPrice, sellPrice);
        this.numStrings = numStrings;
        this.type = type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public PowerType getType() {
        return type;
    }

    public String play() {
        return this.getName() + " is now playing";
    }

    public double markup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
