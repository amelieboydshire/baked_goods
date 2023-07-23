import java.util.OptionalDouble;

public class Cupcake extends BakedGood implements Edible{

    private boolean addFlowers;

    public Cupcake(String name, String flavour, boolean hasIcing, double cost, double price, boolean addFlowers) {
        super(name, flavour, hasIcing, cost, price);
        this.addFlowers = addFlowers;
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

   public boolean hasFlowers() {
        return addFlowers;
   }

   public void setFlowers(boolean addFlowers) {
        this.addFlowers = addFlowers;
   }


   @Override
   public boolean hasIcing() {
        return !getFlavour().equalsIgnoreCase("plain");

   }

   @Override
    public void consume() {
        System.out.println("You are enjoying a yummy cupcake");
   }



}
