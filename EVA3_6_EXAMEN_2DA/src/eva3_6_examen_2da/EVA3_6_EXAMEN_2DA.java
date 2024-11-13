/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_examen_2da;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA3_6_EXAMEN_2DA {
    public static final int PIEDRA = 1;
public static final int PAPEL = 2;
public static final int TIJERA = 3;

public static final int EMPATE = 0;
public static final int GANA = 1;
public static final int PIERDE = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jugadaUsu;
        int jugadaComp;
        int resuJugada;
        do{
            jugadaUsu = capturaJugada("Introduce tu jugada (1-PIEDRA, 2-PAPEL, 3-TIJERA, 0-SALIR):");
            jugadaComp = generaJugadaComp();
            System.out.println(jugadaComp);
            resuJugada = evaluarJugada(jugadaUsu,jugadaComp);
            
        }while(jugadaUsu !=0);
        
        
      
        
    }
    //PEDIR DATOS AL USUARIO
    public static int capturaJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu= captu.nextInt();
        return resu;
    }
    public static int generaJugadaComp(){
        int resu;
        double valor = Math.random();
        if((valor >= 0) && (valor < (0.333)))
            resu = 1; //PIEDRA
        else if((valor >= 0.333)&& (valor < 0.666))
            resu = 2;//PAPEL
        else
            resu = 3; //TIJERA
        return resu;
    }
    //EVALUAR JUGADA 0-EMPATE, 1-GANO, 2-PERDIO
    public static int evaluarJugada(int jugadaU, int jugadaC){
      //9 POSIBLES COMBINACIONES  
        int resu;
        if((jugadaU == PIEDRA)&&(jugadaC == PIEDRA))
            resu = EMPATE;
        else if((jugadaU == PIEDRA)&& (jugadaC == PAPEL))
            resu = PIERDE;
        else if((jugadaU == PIEDRA)&& (jugadaC == TIJERA))
            resu = GANA;
        else if((jugadaU == PAPEL)&& (jugadaC == PIEDRA))
            resu = GANA;
        else if((jugadaU == PAPEL)&& (jugadaC == PAPEL))
            resu = EMPATE;
        else if((jugadaU == PAPEL)&& (jugadaC == TIJERA))
            resu = PIERDE;
        else if((jugadaU == PAPEL)&& (jugadaC == PAPEL))
            resu = EMPATE;
        else if((jugadaU == PAPEL)&& (jugadaC == TIJERA))
            resu = PIERDE;
        else if((jugadaU == TIJERA)&& (jugadaC == PIEDRA))
            resu = PIERDE;
        else if((jugadaU == TIJERA)&& (jugadaC == PAPEL))
            resu = GANA;
        else
            resu = EMPATE;
        return resu;
        
            
    }
    
}
