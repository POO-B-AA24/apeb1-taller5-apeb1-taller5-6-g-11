package problema_5_sistema_de_gestión_de_conflitos;
import java.util.ArrayList;
import java.util.List;
public class Conflicto {
    private String nombre;
    private List<String> paisesInvolucrados;
    private String fechaInicio;
    private String estadoActual;
    private List<Evento> eventos;

    public Conflicto(String nombre, List<String> paisesInvolucrados, String fechaInicio, String estadoActual) {
        this.nombre = nombre;
        this.paisesInvolucrados = paisesInvolucrados;
        this.fechaInicio = fechaInicio;
        this.estadoActual = estadoActual;
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del conflicto: ").append(nombre).append("\n");
        sb.append("Países involucrados: ").append(paisesInvolucrados).append("\n");
        sb.append("Fecha de inicio: ").append(fechaInicio).append("\n");
        sb.append("Estado actual: ").append(estadoActual).append("\n");
        sb.append("Eventos: ").append(eventos).append("\n");
        return sb.toString();
    }
}
