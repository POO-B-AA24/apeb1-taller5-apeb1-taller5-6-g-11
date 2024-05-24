package problema_5_sistema_de_gestión_de_conflitos;
public class Evento {
    private String nombre;
    private String fecha;
    private String ubicacion;
    private String descripcion;

    public Evento(String nombre, String fecha, String ubicacion, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Nombre del evento: " + nombre + "\n" +
                "Fecha: " + fecha + "\n" +
                "Ubicación: " + ubicacion + "\n" +
                "Descripción: " + descripcion;
    }
}
