package unq;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
    private Counter counter;
    @BeforeEach
    public void setUp(){
        //Se crea el contador
        counter = new Counter();
        //Se agregan los numeros. Un solo par y nueve impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }
    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testEvenNumbers() {
    // Getting the even occurrences
        int amount = counter.getEvenOccurrences();
    // I check the amount is the expected one
        assertEquals(9, amount);
    }
    @Test
    public void testOddNumbers(){
        int amount = counter.getOddOccurrences();
        assertEquals(1, amount);
    }

    @Test
    public void testMultipleThree(){
        int amount = counter.getMultipleOccurrences(3);
        assertEquals(2,amount);
    }
}
