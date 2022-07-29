/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_22 {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);

        System.out.println("ingrese la cantidad de filas de la matriz");
        int N = Leer.nextInt();
        
        System.out.println("ingrese la cantidad de columnas de la matriz");
        int M = Leer.nextInt();
        
        int [][] Matriz = CargarMatriz(N,M);
        Mostrar(Matriz,N,M);

    }
    
    public static int[][] CargarMatriz(int N, int M){

        int [][] Matriz = new int [N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Matriz[i][j] = (int)(Math.random()*9);
            }
        }
        return Matriz;
    }
    
    public static void Mostrar(int Matriz[][], int N, int M){

        for (int i = 0; i < N; i++) {
            System.out.println("");
            for (int j = 0; j < M; j++) {
                System.out.print("[" +Matriz[i][j] +"]" );
            }
        }
    } 
}
