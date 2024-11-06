/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_captura;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = capturarTexto("introduce tu nombre:");
        String apellido = capturarTexto("introduce tu apellido:");
        System.out.println("Nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        
        int edad = capturaEnteros("introduce tu edad:");
        System.out.println("edad: " + edad);
        
        double salario = capturaDoubles("introduce tu salario");
        System.out.println("salario" + salario);
        
    }
    //CAPTURA DE TEXTO
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captu.nextLine();
        return texto;
    }
    //metodo para capturar enteros lo usamos para la edad
    public static int capturaEnteros(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int valor = captu.nextInt();
        return valor;
    }
    
    //metodo para capturar doubles (capturar el salario)
    public static double capturaDoubles(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println();
        double valor = captu.nextDouble();
        return valor ;
    }
    
}
