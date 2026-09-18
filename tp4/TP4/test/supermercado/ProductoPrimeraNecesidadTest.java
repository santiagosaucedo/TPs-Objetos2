package supermercado;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoPrimeraNecesidadTest {

    private src.Productos.ProductoPrimeraNecesidad pan;

	@BeforeEach
	public void setUp() {
		pan = new src.Productos.ProductoPrimeraNecesidad("Pan", 6d, true,11);
	}
	@Test
    public void testCorrectoDescuento(){assertEquals(new Double(5.34), pan.getPrecio());}
}
