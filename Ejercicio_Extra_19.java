/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_19 {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);

        System.out.println("cuantos números tendran los vectores");
        int N = Leer.nextInt();
        
        int [] Vector1 = CargarVector(N);
        int [] Vector2 = CargarVector(N);
        boolean Igualdad = CompararVectores(Vector1,Vector2,N);
        Mostrar(Vector1,Vector2,N,Igualdad);

    }
    
    public static int[] CargarVector(int N){

        Scanner Leer = new Scanner(System.in);
        int [] Vector = new int [N];
        
        System.out.println("Cargar Vector");
        
        for (int i = 0; i < N; i++) {

            System.out.println("ingrese un numero");
            Vector[i] = Leer.nextInt();  
        }
        return Vector;
    }
    
    public static boolean CompararVectores(int Vector1[],int Vector2[], int N){
        
        boolean Igualdad=false;
        
        for (int i = 0; i < N; i++) {

            if (Vector1[i]== Vector2[i]) {
                Igualdad=true;
            }else{
                Igualdad=false;
                break;
            } 
        }
        return Igualdad;
    }
    
    public static void Mostrar(int Vector1[],int Vector2[], int N,boolean Igualdad){
            
        System.out.print("Vector 1: ");
        
        for (int i = 0; i < N; i++) {

            System.out.print("[" +Vector1[i] +"]" );
        }
        System.out.println("");
        System.out.print("Vector 2: ");
        for (int i = 0; i < N; i++) {

            System.out.print("[" +Vector2[i] +"]" );
        }
                System.out.println("");
        if (!Igualdad) {
            System.out.println("los vectores no son iguales"); 
        }else{
            System.out.println("los vectores son iguales");
        }
    }    
}
