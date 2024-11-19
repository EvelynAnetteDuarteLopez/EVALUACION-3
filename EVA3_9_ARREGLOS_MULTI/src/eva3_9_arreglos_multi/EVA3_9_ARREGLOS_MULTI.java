/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_9_arreglos_multi;

/**
 *
 * @author invitado
 */
public class EVA3_9_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []billetes = {20, 50, 100, 200, 500, 1000};
        System.out.println(billetes.length);
        String[][]ciudades = {{"Aguas calientes", "calvillo", "jesus maria"},
                {"ensenada", "Mexicali", "tecate", "tijuana"},
                {"la paz", "cabo san lucas", "san jose del cabo"}};
        
        for(int i = 0; i < ciudades.length; i ++){
            for(int j = 0; j < ciudades[i].length; j++){
                System.out.println(ciudades[i][j]);
                
            }
        }
        
        }
    
    
}
