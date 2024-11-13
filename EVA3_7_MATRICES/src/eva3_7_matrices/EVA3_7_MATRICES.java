/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_matrices;

/**
 *
 * @author invitado
 */
public class EVA3_7_MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[5]; //arreglo unidimencional
        int[][] matriz = new int[3][3]; //hoja de excel
        matriz[0][0] = 100; //primer posicion
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz [2][2] = 900; //ultima posicion
        
        for(int i = 0; i < 3; i++){//fila ->1er dimencion
            for(int j = 0; j < 3; j++){//columna ->2da dimencion
              System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        
    }
    
}
