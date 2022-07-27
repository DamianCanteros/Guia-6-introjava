/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_14 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de familias");
        int N = Leer.nextInt();
        
        MediaDeEdad(N);
        
    }
    
    public static void MediaDeEdad(int N){
        
        Scanner Leer = new Scanner(System.in);
        int aux1=0;
        int aux2=0;
        
        for (int i = 0; i < N; i++) {
            
            System.out.println("ingrese la cantidad de hijos");
            int M = Leer.nextInt();
            aux1+=M;
            
            for (int j = 1; j <= M; j++) {
                
                System.out.println("ingrese la edad del hijo número " +j);
                int edad = Leer.nextInt();
                
                aux2+=edad;
            }           
        }
        System.out.println("la media de edad de los hijos de todas las familias es " +aux1/aux2);
    }
}
