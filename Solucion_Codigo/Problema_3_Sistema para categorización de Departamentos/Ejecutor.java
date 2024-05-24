
package problema_3_sistema.para.categorización.de.departamentos;

public class Ejecutor {
  public static void main(String[] args) {
        Empresa empresa = new Empresa("Mi Empresa", "123456789", "Calle Principal 123");

        Departamento departamento1 = new Departamento("Departamento A", 27, 2000000);
        Departamento departamento2 = new Departamento("Departamento B", 13, 800000);
        Departamento departamento3 = new Departamento("Departamento C", 6, 300000);

        empresa.categorizarDepartamento(departamento1);
        empresa.categorizarDepartamento(departamento2);
        empresa.categorizarDepartamento(departamento3);
    }
}