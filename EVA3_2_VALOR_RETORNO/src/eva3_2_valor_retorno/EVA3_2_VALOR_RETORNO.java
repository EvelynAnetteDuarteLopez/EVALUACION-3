/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_valor_retorno;

/**
 *
 * @author invitado
 */
public class EVA3_2_VALOR_RETORNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NECESITAMOS RECUPERAR EL VALOR, PARA HACER ALGO CON EL
        int resu;
        resu = sumarDosNumeros(5, 10);
        System.out.println("Resultado = " + resu);
        //segunda alternativas, solo necesitas una vez
        System.out.println("Resultado = " + sumarDosNumeros(100, 200));
        
        //no les interesa el resultado
        sumarDosNumeros(100, 200); // el resultado se pierde
    }
    
    public static int sumarDosNumeros(int num1, int num2){
        return num1 + num2;
    }
}
