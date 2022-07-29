/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_20 {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);

        System.out.println("cuantos números desea ingresar");
        int N = Leer.nextInt();
        
        int [] Vector = CargarVector(N);
        Mostrar(Vector,N);

    }
    
    public static int[] CargarVector(int N){

        int [] Vector = new int [N];
        
        for (int i = 0; i < N; i++) {

            Vector[i] = (int)(Math.random()*9);
        }
        return Vector;
    }
    
    public static void Mostrar(int Vector[], int N){
            
        System.out.print("V: ");
        
        for (int i = 0; i < N; i++) {

            System.out.print("[" +Vector[i] +"]" );
        }
    }
}
