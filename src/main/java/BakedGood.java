public abstract class BakedGood {

    protected String name;
    protected String flavour;
    protected boolean hasIcing;
    protected double cost;
    protected double price;


    public BakedGood(String name, String flavour, boolean hasIcing, double cost, double price) {
        this.name = name;
        this.flavour = flavour;
        this.hasIcing = hasIcing;
        this.cost = cost;
        this.price = price;
    }

// Getters and setters
//
//    public String getName() {
//    return name;

//    public void setName(String name) {
//        this.name = name;
//    }
//
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

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    //    Methods

    public void calculateMargin() {
        double margin = price - cost;
        System.out.println("Margin: " + margin);
    }

    public abstract boolean hasIcing();



}
