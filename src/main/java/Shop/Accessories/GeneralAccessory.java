package Shop.Accessories;

import Shop.ISell;
import Shop.ShopItem;

public class GeneralAccessory extends ShopItem implements ISell {

    private String type;

    public GeneralAccessory(String name, String make, String model, double buyPrice, double sellPrice, String type) {
        super(name, make, model, buyPrice, sellPrice);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public double markup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
