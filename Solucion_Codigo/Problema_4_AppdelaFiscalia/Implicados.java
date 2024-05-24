
package problema_4_appdelafiscalia;

public class Implicados {
    public String nombreImplicado;
    public int edad;
    public String ocupacion;
    public int nivelImplicacion;
    public int condena;
    public String confesion;
    public int diasatencion;

    public Implicados(String nombreImplicado, int edad, String ocupacion,int nivelImplicacion, int condena, int diasatencion, String confesion) {
        this.nombreImplicado = nombreImplicado;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.confesion = confesion;
        this.condena = condena;
        this.diasatencion = diasatencion;
    }

    public String calcularEstado() {
        if (this.diasatencion < 7) {
            return "Estado INICIADO";
        } else if (this.diasatencion >= 7 && this.diasatencion < 14) {
            return "Estado ALERTA";
        } else if (this.diasatencion >= 14) {
            return "Estado URGENTE";
        }
        return "";
    }
    public String determinarReduccion() {
        if (this.confesion.equals("Si")) {
            return "Se le acogerá su reducción ya que confesó la verdad";
        } else if (this.confesion.equals("No")) {
            return "Seguiremos investigando su caso";
        }
        return "";
    }
    public String tiempoCondena() {
        if (this.condena <= 1) {
            return "Usted puede pagar fianza con información útil, dicho esto la fianza no podrá superar el 50%";
        }
        return "";
    }
        @Override
    public String toString() {
    return "Implicados{" +
            "\n    nombreImplicado='" + nombreImplicado + '\'' +
            ",\n    edad=" + edad +
            ",\n    ocupacion='" + ocupacion + '\'' +
            ",\n    nivelImplicacion=" + nivelImplicacion +
            ",\n    condena=" + condena +
            ",\n    confesion='" + confesion + '\'' +
            ",\n    diasatencion=" + diasatencion +
            "\n}";
}

}