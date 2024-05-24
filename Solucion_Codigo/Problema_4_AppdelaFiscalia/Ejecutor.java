package problema_4_appdelafiscalia;
import java.util.Scanner;
import java.io.*;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("||CASO||");
        Caso c1 = new Caso("Muerte del Sargento Juarez", "27-09-2023", "Abierto");
        System.out.println(c1);
        System.out.println("||COLABORADORES DEL CASO||");
        Colaboradores co1 = new Colaboradores("Juan", "Abogado Principal");
        Colaboradores co2 = new Colaboradores("Dante", "Juez");
        Colaboradores co3 = new Colaboradores("Riofrio", "Testigo");
        System.out.println(co1);
        System.out.println(co2);
        System.out.println(co3);
        System.out.println("||ESTADO DEL IMPLICADO 1||");
        Implicados i1 = new Implicados("Alex", 27, "Militar", 3, 7, 7, "Si");
        System.out.println(i1);
        System.out.println("Estado: " + i1.calcularEstado());
        System.out.println("Reducción de pena: " + i1.determinarReduccion());
        System.out.println("Tiempo de condena: " + i1.tiempoCondena());
        
        System.out.println("||ESTADO DEL IMPLICADO 2||");
        Implicados i2 = new Implicados("Tene", 37, "Profesor", 1, 14, 15, "No");
        System.out.println(i2);
        System.out.println("Estado: " + i2.calcularEstado());
        System.out.println("Reducción de pena: " + i2.determinarReduccion());
        System.out.println("Tiempo de condena: " + i2.tiempoCondena());
    }
}
