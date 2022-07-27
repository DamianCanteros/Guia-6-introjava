/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_11 {

    public static void main(String[] args) {
       
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("ingrese un número entero");
        int num = Leer.nextInt();

        CalcularDigitos(num);
    }
    
    public static void CalcularDigitos(int num){
        
        int i=1;
        
        do {
            
            i+=1;
            num = num/10;
            
        } while (num>10);
        
        System.out.println("la cantidad de dígitos es " +i);
    }
}
