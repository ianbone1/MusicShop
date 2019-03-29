package Shop.Instrument;

import Shop.IPlay;
import Shop.ISell;
import Shop.ShopItem;

public class Keyboard extends ShopItem implements IPlay, ISell {

    private int keys;
    private PowerType type;

    public Keyboard(String name, String make, String model, double buyPrice, double sellPrice, int keys, PowerType type) {
        super(name, make, model, buyPrice, sellPrice);
        this.keys = keys;
        this.type = type;
    }

    public int getKeys() {
        return this.keys;
    }

    public PowerType getType() {
        return this.type;
    }

    public String play(){
        return this.getName() + " is now playing";
    }

    public double markup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}

