/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_13 {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("ingrese la altura de la escalera");
        int altura = Leer.nextInt();
        
        EscaleraDeNumeros(altura);
        
    }
    
    public static void EscaleraDeNumeros(int altura){
        
        for (int i = 1; i <=altura+1; i++) {
                
            for (int j = 1; j < i; j++) {
                       
                  System.out.print(j);   
                    
            } 
            System.out.println("");  
        }
    }
}
