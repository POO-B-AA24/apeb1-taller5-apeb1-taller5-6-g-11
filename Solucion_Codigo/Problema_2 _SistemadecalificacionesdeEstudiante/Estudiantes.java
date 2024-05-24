package problema_2._sistema.de.calificaciones.de.estudiante;
public class Estudiantes {
    private String nombre;
    private int edad;
    private Materia materia;

    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public Materia getMateria() {
        return materia;
    }
    public String verificarAprobacion() {
        if (materia == null) {
            return "No hay una materia asignada, volver a verificar";
        }
        double totalCalificaciones = materia.getACD() + materia.getAPE() + materia.getAA();
        double porcentajeAprobacion = (totalCalificaciones/30)*100;

        if (porcentajeAprobacion>=70) {
            return "El estudiante " + nombre + " ha aprobado la materia de " + materia.getNombre() + ".";
        } else {
            return "El estudiante " + nombre + " debe rendir un examen de recuperacion";
        }
    }
    @Override
    public String toString() {
        return "Estudiante: nombre=" + nombre + ", edad=" + edad + ", materia=" + materia.getNombre();
    }
}
