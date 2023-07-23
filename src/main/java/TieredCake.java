import java.util.List;

public class TieredCake extends BakedGood {

private int tiers;

   public TieredCake(String name, String flavour, boolean hasIcing, double cost, double price, int tiers) {
       super(name, flavour, hasIcing, cost, price);
       this.tiers = tiers;
   }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getNumberOfTiers() {

       return tiers;
    }

    public void setNumberOfTiers(int tiers) {

       this.tiers = tiers;
    }

    public void addTier() {

       tiers++;
    }

    @Override
    public boolean hasIcing() {
        return !getFlavour().equalsIgnoreCase("plain");

    }
}



