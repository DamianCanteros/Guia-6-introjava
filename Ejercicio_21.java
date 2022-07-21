/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package introjava;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_21 {

    public static void main(String[] args) {
        
        int [][] MatrizM, MatrizP;
        MatrizM = new int [10][10];
        MatrizP = new int [3][3];
        
        RellenarYMostrarMatrizM(MatrizM );
        RellenarYMostrarMatrizP(MatrizP );
        BuscarMatriz(MatrizM,MatrizP);
    }
    
    public static void RellenarYMostrarMatrizM( int MatrizM [][]){
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                MatrizM [i][j] = random.nextInt(100);
                System.out.print("[" +MatrizM [i][j] +"]");            
            }
            System.out.println("");
        }
    }
    
        public static void RellenarYMostrarMatrizP( int MatrizP [][]){
        
            Scanner Leer= new Scanner(System.in);
            
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.println("ingrese un número");
                MatrizP [i][j] = Leer.nextInt();
            }
        }
        
                for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print("[" +MatrizP [i][j] +"]");            
            }
            System.out.println("");
        }
    }
        
        public static void BuscarMatriz( int MatrizM [][], int MatrizP [][]){
        
        String [] [] Coordenadas;
        Coordenadas = new String [3] [3];
        int k=-1;
        int l=0;
                
        for (int i = 0; i < 10; i++) {
            k+=1;
            if (k==3){
                break;
            }else {
                    for (int j = 0; j < 10; j++) {

                    if (MatrizM [i][j] == MatrizP [k][l] ) {

                        Coordenadas [i][j] = i +"," + j;
                        if (l==2) {
                            l=0;
                            break;
                        }
                        l+=1;   
                    }
                }
            }    
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print(Coordenadas [i][j]+", ");            
            }
        }
    }
}
