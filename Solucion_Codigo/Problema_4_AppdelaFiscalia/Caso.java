
package problema_4_appdelafiscalia;

public class Caso {
    public String nombreCaso;
    public String fechadelCaso;
    public String estadodelCaso;

    //PERSONAS IMPLICADAS
    public Caso(String nombreCaso, String fechadelCaso, String estadodelCaso) {
        this.nombreCaso = nombreCaso;
        this.fechadelCaso = fechadelCaso;
        this.estadodelCaso = estadodelCaso;
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public void setNombreCaso(String nombreCaso) {
        this.nombreCaso = nombreCaso;
    }

    @Override
    public String toString() {
    return "Caso{" +
            "\n    nombreCaso='" + nombreCaso + '\'' +
            ",\n    fechadelCaso='" + fechadelCaso + '\'' +
            ",\n    estadodelCaso='" + estadodelCaso + '\'' +
            "\n}";
}

}