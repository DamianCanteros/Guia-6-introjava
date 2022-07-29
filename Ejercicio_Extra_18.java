/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_18 {

    public static void main(String[] args) {
 
        Scanner Leer = new Scanner(System.in);

        System.out.println("cuantos números desea ingresar");
        int N = Leer.nextInt();
        
        int [] Vector = CargarVector(N);
        int Suma = SumarVector(Vector,N);
        Mostrar(Vector,N,Suma);

    }
    
    public static int[] CargarVector(int N){

        Scanner Leer = new Scanner(System.in);
        int [] Vector = new int [N];
        
        for (int i = 0; i < N; i++) {

            System.out.println("ingrese un número");
            Vector[i] = Leer.nextInt();  
        }
        return Vector;
    }
    
    public static int SumarVector(int Vector[], int N){
        
        int Suma =0;
        for (int i = 0; i < N; i++) {

            Suma += Vector[i];  
        }
        return Suma;
    }
    
    public static void Mostrar(int Vector[], int N, int Suma){
            
        System.out.print("V: ");
        
        for (int i = 0; i < N; i++) {

            System.out.print("[" +Vector[i] +"]" );
        }
        System.out.println("");
        System.out.println("la suma de todos los elementos de el vector es " +Suma );
    }
}
