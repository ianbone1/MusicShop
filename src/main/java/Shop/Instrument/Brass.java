package Shop.Instrument;

import Shop.IPlay;
import Shop.ISell;
import Shop.ShopItem;

public class Brass extends ShopItem implements IPlay, ISell {

    private int valves;
    private String colour;
    private BrassType type;

    public Brass(String name, String make, String model, double buyPrice, double sellPrice, int valves, String colour, BrassType type) {
        super(name, make, model, buyPrice, sellPrice);
        this.valves = valves;
        this.colour = colour;
        this.type = type;
    }

    public int getValves() {
        return this.valves;
    }

    public String getColour() {
        return this.colour;
    }

    public BrassType getType() {
        return this.type;
    }

    public String play(){
        return this.getName() + " is now playing";
    }

    public double markup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
