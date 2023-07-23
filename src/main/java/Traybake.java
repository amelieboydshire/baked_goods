public class Traybake extends BakedGood {

    private int slices;
    private boolean addSprinkles;

    public Traybake(String name, String flavour, boolean hasIcing, double cost, double price, int slices, boolean addSprinkles) {
        super(name, flavour, hasIcing, cost, price);
        this.slices = slices;
        this.addSprinkles = addSprinkles;
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

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    public boolean hasSprinkles() {
        return addSprinkles;
    }

    public void setSprinkles (boolean addSprinkles) {
        this.addSprinkles = addSprinkles;
    }

    public boolean addSprinkles() {
        return true;
    }

    @Override
    public boolean hasIcing() {
        return true;
    }
}
