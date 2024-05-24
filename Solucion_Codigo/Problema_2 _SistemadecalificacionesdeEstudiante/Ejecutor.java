
package problema_2._sistema.de.calificaciones.de.estudiante;
import java.util.Scanner;
public class Ejecutor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombreEstudiante = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); 
        
        Estudiantes estudiante = new Estudiantes(nombreEstudiante, edadEstudiante);
        
        System.out.println("Ingrese el nombre de la materia:");
        String nombreMateria = scanner.nextLine();
        System.out.println("Ingrese la calificacion ACD:");
        double acd = scanner.nextDouble();
        System.out.println("Ingrese la calificacion APE:");
        double ape = scanner.nextDouble();
        System.out.println("Ingrese la calificacion AA:");
        double aa = scanner.nextDouble();
        scanner.nextLine(); 
        Materia materia = new Materia(nombreMateria, acd, ape, aa);
        estudiante.setMateria(materia);

       
        System.out.println(estudiante.verificarAprobacion());

        scanner.close();
    }
}