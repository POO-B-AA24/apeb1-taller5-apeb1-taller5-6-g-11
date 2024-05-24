package problema_3_sistema.para.categorización.de.departamentos;

public class Empresa {
    private String nombre;
    private String ruc;
    private String dic;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.dic = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRuc() {
        return ruc;
    }
    public String getDireccion() {
        return dic;
    }
    public void categorizarDepartamento(Departamento departamento) {
        System.out.println("Categorizando departamento " + departamento.getNombre() + "...");
        System.out.println("Categoria: " + departamento.getCategoria());
    }
}
