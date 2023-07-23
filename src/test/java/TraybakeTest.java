import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TraybakeTest {

    private Traybake traybake;

    @BeforeEach
    public void SetUp() {
        traybake = new Traybake("Rocky Road", "Chocolate", true, 2.00, 5.00, 12, true);
    }

    @Test
    public void canGetHasIcing() {
        assertThat(traybake.hasIcing()).isEqualTo(true);
    }


    @Test
    public void canGetNumberOfSlices() {
        assertThat(traybake.getSlices()).isEqualTo(12);
    }

    public void canSetNumberOfSlices() {
        traybake.setSlices(4);
        assertThat(traybake.getSlices()).isEqualTo(4);
    }

}
