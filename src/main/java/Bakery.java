import java.util.List;

public class Bakery {

    private String name;
    private List<BakedGood> stock;
    private double till;

    public Bakery(String name, List<BakedGood> stock, double till) {
        this.name = name;
        this.stock = stock;
        this.till = till;
    }

    public List<BakedGood> getStock() {
        return stock;
    }

    public void setStock(List<BakedGood> stock) {
        this.stock = stock;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public double calculateProfit() {
        double totalProfit = 0.0;

        for (BakedGood bakedGood : stock) {
            double cost = bakedGood.getCost();
            double price = bakedGood.getPrice();

            double itemProfit = price - cost;

            totalProfit += itemProfit;

        }

        return totalProfit;
    }

    public void addItemToStock(BakedGood item) {
        stock.add(item);
    }

    public void subtractFromTill(double price) {
        till -= price;
    }

}
