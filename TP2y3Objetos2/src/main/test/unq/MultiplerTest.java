package unq;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplerTest {
    private Multipler multi;

    @BeforeEach
    public void setuP(){
        multi = new Multipler();

    }

    @Test
    public void theMaxMultiplerNumber3and9(){
        int theHighest = multi.getHighestMultipleOf(3,9);
        assertEquals(999, theHighest);
    }
}
