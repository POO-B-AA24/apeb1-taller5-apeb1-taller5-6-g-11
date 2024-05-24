
package ejecutorsistemasventas;

public class EjecutorSistemasVentas {

    public static void main(String[] args) {
        
        CarrodeCompras carrito = new CarrodeCompras();
        
        Producto producto1 = new Producto("Banana", 2, 4);
        Producto producto2 = new Producto("Chocolates", 1.5, 80);
        Producto producto3 = new Producto("Uvas", 3.0, 50);
        
        carrito.agregarProducto(producto1, 100);
        carrito.agregarProducto(producto2, 50);
        carrito.agregarProducto(producto3, 20);
        carrito.mostrarDetalleCompra(); 
        
        double total = carrito.calcularTotal();
        System.out.println("Total de la compra: $" + String.format("%.2f", total));
        // ACA SE PONE EL DINERO Y DESCUENTO
        System.out.println(carrito.realizarPago(136, 10)); 
    }
}