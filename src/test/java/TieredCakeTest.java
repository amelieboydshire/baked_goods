import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    private TieredCake tieredCake;

    @BeforeEach
    public void setUp() {
        tieredCake = new TieredCake("Red Velvet"
                , "chocolate", true, 3.00, 8.00, 2);
    }

    @Test
    public void canGetHasIcing() {
        assertThat(tieredCake.hasIcing()).isEqualTo(true);
    }

    @Test
    public void canGetNumberOfTiers() {
        assertThat(tieredCake.getNumberOfTiers()).isEqualTo(2);
    }

    public void canSetNumberOfTiers() {
        tieredCake.setNumberOfTiers(4);
        assertThat(tieredCake.getNumberOfTiers()).isEqualTo(4);
    }

    @Test
    public void canAddTier() {
        tieredCake.addTier();
        assertThat(tieredCake.getNumberOfTiers()).isEqualTo(3);
    }


}
