
package ejecutorsistemasventas;
    public class Producto {
        private String nombre;
        private double precio;
        private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void reducirCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }

    @Override
    public String toString() {
        return String.format("Producto: %s, Precio: %.2f, Cantidad disponible: %d", nombre, precio, cantidad);
    }
}
