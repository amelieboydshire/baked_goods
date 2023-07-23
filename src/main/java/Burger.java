public class Burger implements Edible {

    private String name;
    private double price;

    public Burger(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void consume() {
        System.out.println("You are enjoying a tasty " + name +  "burger!");
    }
}
