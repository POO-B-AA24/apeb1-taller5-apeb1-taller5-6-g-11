package problema_5_sistema_de_gestión_de_conflitos;

import java.util.ArrayList;
import java.util.List;

public class Ejecutor {
    public static void main(String[] args) {
       
        Evento evento1 = new Evento("Tratado de Paz", "2024-05-24", "Guayaquill", "Firma del tratado de paz entre México y Ecuador");
        Evento evento2 = new Evento("Embajada ecuatoriana", "2024-05-24", "Quito", "Se busca la paz para esto");
        
        List<String> paisesInvolucrados = new ArrayList<>();
        paisesInvolucrados.add("Ecuador");
        paisesInvolucrados.add("Colombia");
        Conflicto conflicto2 = new Conflicto("Tratado de Paz", paisesInvolucrados, "2024-01-01", "En curso");
        Conflicto conflicto1 = new Conflicto("Embajada ecuatoriana", paisesInvolucrados, "2024-01-01", "En curso");
        conflicto1.agregarEvento(evento1);
        conflicto2.agregarEvento(evento2);
        
        System.out.println(conflicto1.toString());
        System.out.println(conflicto2.toString());
    }
}
