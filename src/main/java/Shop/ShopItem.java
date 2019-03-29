package Shop;

public abstract class ShopItem {
    private String name;
    private String make;
    private String model;
    private double buyPrice;
    private double sellPrice;

    public ShopItem(String name, String make, String model, double buyPrice, double sellPrice) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return this.name;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }
}
