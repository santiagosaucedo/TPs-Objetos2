package src.Productos;

public class Producto {
    private String nombre;
    private double precio;
    private boolean precioCuidado;

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto(String nombre, double precio, boolean esPrecioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuidado = esPrecioCuidado;
    }

    public boolean esPrecioCuidado(){
        return this.precioCuidado;
    }

    public Producto(String nombre, double precio){
        this(nombre,precio,false);
    }

    public void aumentarPrecio(double aumento){
        this.precio += aumento;
    }
}
