package problema_3_sistema.para.categorización.de.departamentos;
public class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private double produccionAnual;
    public Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
    }
    public String getCategoria() {
        if (numeroEmpleados>20&& produccionAnual>1000000) {
            return "A";
        } else if (numeroEmpleados>= 10&& produccionAnual >= 500000) {
            return "B";
        } else {
            return "C";
        }
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
    public double getProduccionAnual() {
        return produccionAnual;
    }
    @Override
    public String toString() {
        return "Departamento: " + nombre + ", Empleados: " + numeroEmpleados + ", Producción Anual: " + produccionAnual + ", Categoría: " + getCategoria();
    }
}
