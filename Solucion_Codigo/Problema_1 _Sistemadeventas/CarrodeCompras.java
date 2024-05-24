package ejecutorsistemasventas;
import java.util.ArrayList;
import java.util.List;

public class CarrodeCompras {
    private List<Producto> productos;

    public CarrodeCompras() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidad() >= cantidad) {
            Producto productoEnCarrito = new Producto(producto.getNombre(), producto.getPrecio(), cantidad);
            productos.add(productoEnCarrito);
            System.out.println(producto.getNombre() + " se ha agregado al carro.");
        } else {
            System.out.println("No hay de este producto " + producto.getNombre() + ".");
        }
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
    public String realizarPago(double montoPagado, double descuento) {
        double total = calcularTotal();
        if (total > 1000) {
            total -= total * (descuento / 100);
            System.out.println("Usted tiene un descuento del " + descuento + "% al total de la compra.");
        }
        if (montoPagado >= total) {
            for (Producto producto : productos) {
                producto.reducirCantidad(producto.getCantidad());
            }
            double vuelto = montoPagado - total;
            return " Su cambio es $" + String.format("%.2f", vuelto) + " Gracias por confiar en nosotros!";
        } else {
            double faltante = total - montoPagado;
            return "El dinero no es suficiente para el pago, le faltan $" + String.format("%.2f", faltante) + " dolares";
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("Detalles de la compra:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
