package src.Productos;

public class ProductoPrimeraNecesidad extends src.Productos.Producto {
    private double descuento;

    public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
    }

    public ProductoPrimeraNecesidad(String nombre, double precio,boolean esPrecioCuidado ,double descuento) {
        super(nombre, precio, esPrecioCuidado);
        this.descuento = descuento;
    }

    public ProductoPrimeraNecesidad(String nombre, double precio) {
        super(nombre, precio);
    }

    private double getDescuento(){
        return (this.descuento / 100);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() - (super.getPrecio()/*el this.precio*/ * this.getDescuento()/*la cantidad a multiplicar de descuento*/);
    }
}
