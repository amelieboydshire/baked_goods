import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    private Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        cupcake = new Cupcake("Vanilla Swirl", "vanilla", true, 2.00, 3.00, true);
    }

    @Test
    public void canGetHasIcing() {
        assertThat(cupcake.hasIcing()).isEqualTo(true);
    }


   @Test
    public void canGetAddFlowers() {
        assertThat(cupcake.hasFlowers()).isEqualTo(true);
   }

   @Test
    public void canSetAddFlowers() {
        cupcake.setFlowers(false);
        assertThat(cupcake.hasFlowers()).isEqualTo(false);
   }


}