/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_metodos;

/**
 *
 * @author invitado
 */
public class EVA3_4_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("numero mayor " + encontrarMayor(1, 4));
        System.out.println("dia de la semana " + diaSemana(5));
        
    }
    public static int encontrarMayor(int num1, int num2){
        if(num1 > num2){
           return num1;
        }else{
            return num2;
            
        }       
        
    }
    
    //metodo que regrese el dia de la semana en texto. pide el numero
    //(1 a 7) y regresa: lunew
     public static String diaSemana(int dia){
         
         switch (dia){
             case 1:
                 return "Lunes";
             case 2:
                 return "Martes";
             case 3:
                 return "Miercoles";
             case 4 :
                 return "Jueves";
             case 5:
                 return "Viernes";
             case 6:
                 return "Sabado";
             case 7:
                 return "Domingo";
             default:
                 return " no valido";
         }
     }
    
}
