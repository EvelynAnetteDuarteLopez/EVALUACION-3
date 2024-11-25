/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_11_tic_tac_toe;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author invitado
 */
public class EVA3_11_TIC_TAC_TOE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
char[][]tablero = new char[3][3];
  Scanner captu = new Scanner(System.in);
  char jugadorActual='X';
boolean juego = true;
  for(int i = 0; i < 3; i++){
      Arrays.fill(tablero [i], ' ');
  }
  do{
      imprimirTablero(tablero);
      System.out.println("tic tac toe"); 
      System.out.println("ingresa la fila");
      int fila = captu.nextInt();
      System.out.println("ingresa la columna");
      int columna = captu.nextInt();
      
      if(fila < 0|| fila > 2|| columna < 0 || columna > 2){
          System.out.println("posicion invalida");
          continue;
      }
      
      if(tablero[fila][columna]!=' '){
      System.out.println("posicion ocupada");
      continue;
      }
      tablero[fila][columna]=jugadorActual;
      if(buscarGanador(tablero,jugadorActual)){
          System.out.println("Ha ganado: "+jugadorActual);
          juego=false;
      }
      if(tableroLleno(tablero)&&!buscarGanador(tablero,jugadorActual)){
          System.out.println("El juego termina en empate");
          juego=false;
          
      }
      jugadorActual=(jugadorActual=='X'?'O':'X');
  }while(juego);
          
  
   
        
    
    
    }
    public static void imprimirTablero(char [][]tablero){
        for(int i = 0; i < 3; i++){
            System.out.println(" " + tablero[i][0] + "|" + tablero[i][1] + "|"
                               + tablero [i][2]);
        }
    }
    public static boolean buscarGanador(char [][]tablero, char jugadorActual){
       for(int i = 0; i < 3; i++){
            if(tablero[i][0] == jugadorActual && tablero [i][1] == jugadorActual
           && tablero [i][2] == jugadorActual)return true;
             if(tablero[0][i] == jugadorActual && tablero [1][i] == jugadorActual
           && tablero [2][i] == jugadorActual)return true;
             
       }     return((tablero[0][2]==jugadorActual &&tablero[1][1]==jugadorActual &&tablero[2][0]==jugadorActual )|| (tablero[0][0]==jugadorActual &&tablero[1][1]==jugadorActual &&tablero[2][2]==jugadorActual ));
    
    }
    public static boolean tableroLleno(char[][]tablero){
        for(int i = 0; i<3;i++){
            for(int j=0; j<3;j++){
                if(tablero[i][j]==' ') return false;
            }
        }
        return true;
    }
}

