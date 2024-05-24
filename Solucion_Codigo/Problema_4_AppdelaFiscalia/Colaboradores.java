
package problema_4_appdelafiscalia;

public class Colaboradores {
    public String nombreColaboradores;
    public String roles;

    public Colaboradores(String nombreColaboradores, String roles) {
        this.nombreColaboradores = nombreColaboradores;
        this.roles = roles;
    }

  @ Override
    public String toString() {
    return "Colaboradores{" +
            "nombreColaboradores='" + nombreColaboradores + '\'' +
            ", roles='" + roles + '\'' +
            '}';
    }
}
