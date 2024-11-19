/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_arreglos_multi;

/**
 *
 * @author invitado
 */
public class EVA3_10_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][][] cubo = new int [5][5][5][5][5];
        
        for(int i = 0; i < cubo.length; i++){
            for(int j = 0; j < cubo[i].length; j++){
               for(int k = 0; k < cubo[i][j].length; k++){
                for(int l = 0; l < cubo[i][j][k].length; l++){
                    for(int m  = 0; m < cubo[i][j][k][l].length; m++){
                        System.out.println(cubo[i][j][k][l][m]);
                
            }
                
            }
            } 
            }
        }
        
    }
    
}
