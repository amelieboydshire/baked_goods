import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BakeryTest {


    private Bakery bakery;
    private List<BakedGood> stock;

    @BeforeEach
    public void SetUp() {
        stock = new ArrayList<>();
        stock.add(new Cupcake("Vanilla Swirl", "vanilla", true, 2.00, 3.00, true));
        stock.add(new TieredCake("Red Velvet", "chocolate", true, 3.00, 8.00, 2));
        bakery = new Bakery("Gails", stock, 100.00);
    }

    @Test
    public void canCalculateProfit() {
        double expectedProfit = (3.00 - 2.00) + (8.00 - 3.00);
        assertThat(bakery.calculateProfit()).isEqualTo(expectedProfit);
    }

    @Test
    public void testAddItemToStock() {
        BakedGood newItem = new Cupcake("Blueberry Bliss", "blueberry", true, 1.50, 2.50, false);
        bakery.addItemToStock(newItem);
        assertThat(bakery.getStock()).contains(newItem);

    }

    @Test
    public void canSubtractFromTill() {
        double priceToSubtract = 10.00;
        bakery.subtractFromTill(priceToSubtract);
        assertThat(bakery.getTill()).isEqualTo(100.00 - priceToSubtract);
    }
}
