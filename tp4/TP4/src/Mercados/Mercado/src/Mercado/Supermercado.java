package src.Mercado;

import src.Productos.Producto;

import java.util.List;

public class Supermercado {
    private String nombre;
    private String direccion;
    private List<Producto> misProductos;

    public Supermercado(String nombre,String direccion){
        this.nombre =nombre;
        this.direccion = direccion;
    }

    public double getPrecioTotal() {
        return misProductos.stream()
                .mapToDouble(producto -> producto.getPrecio())
                .sum();
    }

    public int getCantidadDeProductos() {
        return (int) misProductos.stream().count();
    }

    public void agregarProducto(Producto productoAAgregar){
        misProductos.add(productoAAgregar);
    }
}
