package problema_2._sistema.de.calificaciones.de.estudiante;
public class Materia {
    private String nombre;
    private double ACD;
    private double APE;
    private double AA;

    public Materia(String nombre, double ACD, double APE, double AA) {
        this.nombre = nombre;
        this.ACD = ACD;
        this.APE = APE;
        this.AA = AA;
    }
    public String getNombre() {
        return nombre;
    }
    public double getACD() {
        return ACD;
    }
    public double getAPE() {
        return APE;
    }
    public double getAA() {
        return AA;
    }
    @Override
    public String toString() {
        return "Materia: nombre=" + nombre + ", ACD=" + ACD + ", APE=" + APE + ", AA=" + AA;
    }
}
