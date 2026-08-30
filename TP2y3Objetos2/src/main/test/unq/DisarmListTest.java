package unq;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisarmListTest {
    private DisarmNumber disarmer;
    @BeforeEach
    public void setUp(){
        disarmer = new DisarmNumber();
        disarmer.setListOfNumbers(List.of(248,8000,135));

    }
    @Test
    public void numberWhitMoreEvensIts8000(){
        int numberWhitMoreEvensInTheList = disarmer.getNumberWithMoreEvensIn(disarmer.getListOfNumbers());
        assertEquals(8000,numberWhitMoreEvensInTheList);
    }

    @Test
    public void test3EvensInFirstPlace(){
        int cantOfEvens = disarmer.getCantEvenNumbers(disarmer.getListOfNumbers().getFirst());
        assertEquals(3 , cantOfEvens);
    }
}
