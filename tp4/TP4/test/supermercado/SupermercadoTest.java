package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupermercadoTest {
	
	private src.Productos.Producto arroz;
	private src.Productos.Producto detergente;
	private src.Mercado.Supermercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz = new src.Productos.Producto("Arroz", 18.9d, true);
		detergente = new src.Productos.Producto("Detergente", 75d);
		supermercado = new src.Mercado.Supermercado("Lo de Tito", "Av Zubeldia 801");
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.getCantidadDeProductos());
	}
	
	@Test
	public void testPrecioTotal() {
		assertEquals(new Double(0), supermercado.getPrecioTotal());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(new Double(93.9), supermercado.getPrecioTotal());
	}
}
