/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_practico;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
     int numeroEstudiantes;
        do {
            System.out.print("Ingrese el número de estudiantes (mayor a 0): ");
            numeroEstudiantes = captu.nextInt();
        } while (numeroEstudiantes <= 0);

        // Crear arreglo para las calificaciones
        double[] calificaciones = new double[numeroEstudiantes];

        // Solicitar calificaciones
        for (int i = 0; i < numeroEstudiantes; i++) {
            double calificacion;
            do {
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + " (entre 0 y 100): ");
                calificacion = captu.nextDouble();
            } while (calificacion < 0 || calificacion > 100);
            calificaciones[i] = calificacion;
        }

        // Calcular resultados
        double promedio = calcularPromedio(calificaciones);
        int mayoresOIgualesPromedio = contarCalificacionesMayores(calificaciones, promedio);
        double calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);
        double calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);

        
        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Número de calificaciones mayores o iguales al promedio: " + mayoresOIgualesPromedio);
        System.out.println("Calificación más alta: " + calificacionMasAlta);
        System.out.println("Calificación más baja: " + calificacionMasBaja);
    }

    // Método para calcular el promedio
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método para contar calificaciones mayores o iguales al promedio
    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Método para obtener la calificación más alta
    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double max = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > max) {
                max = calificacion;
            }
        }
        return max;
    }

    // Método para obtener la calificación más baja
    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double min = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < min) {
                min = calificacion;
            }
        }
        return min;
    }
            
     
        
    }
  
