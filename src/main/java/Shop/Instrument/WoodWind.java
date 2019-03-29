package Shop.Instrument;

import Shop.IPlay;
import Shop.ISell;
import Shop.ShopItem;

public class WoodWind extends ShopItem implements IPlay, ISell {

    private int keys;
    private WoodWindType type;
    public WoodWind(String name, String make, String model, double buyPrice, double sellPrice, int keys, WoodWindType type) {
        super(name, make, model, buyPrice, sellPrice);
        this.keys = keys;
        this.type = type;
    }

    public int getKeys() {
        return this.keys;
    }

    public WoodWindType getType() {
        return this.type;
    }

    public String play() {
        return this.getName() + " is now playing";
    }

    public double markup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
