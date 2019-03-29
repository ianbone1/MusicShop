package Shop;

import Shop.Accessories.GeneralAccessory;

import java.util.ArrayList;

public class Shop{

    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getAllStock() {
        return this.stock;
    }

    public String getName() {
        return this.name;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addStock(ISell inventory) {
        this.stock.add(inventory);
    }

    public double getProfit() {
        double tally=0;
        for (ISell inventory : this.stock){
            tally += inventory.markup();
        }
        return tally;
    }
    public void removeStock(ISell removeMe){
        this.stock.remove(removeMe);
    }
}
