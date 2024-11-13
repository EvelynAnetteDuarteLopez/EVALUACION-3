/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_arreglos_multi;

/**
 *
 * @author invitado
 */
public class EVA3_8_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] cubo = new int [2][5][3];
        for(int i = 0; i < 2;i++){//1ER DIM
             for(int j = 0; j < 5 ;j++){//2DA DIM
                  for(int k = 0; k < 3;k++){//3ER DIM
                    cubo[i][j][k] = (int)(Math.random() * 100);
                  }
             }
        }
        //IMPRIMIR VALORES
        for(int i = 0; i < 2;i++){//1ER DIM
             for(int j = 0; j < 5 ;j++){//2DA DIM
                  for(int k = 0; k < 3;k++){//3ER DIM
                    cubo[i][j][k] = (int)(Math.random() * 100);
                    System.out.print("[" + cubo[i][j][k] + "]");
                  }
             }
        }
        
    }
    
    
}
