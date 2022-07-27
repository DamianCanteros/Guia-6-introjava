/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_16 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        String Respuesta;
        
        do {
            System.out.println("ingrese su nombre");
            String nombre = Leer.next();
        
            System.out.println("ingrese su edad");
            int edad = Leer.nextInt();
            
            System.out.println("su nombre es " +nombre);
            System.out.println("su edad es " +edad);
            
            if (edad>20) {
                System.out.println("es mayor de edad");    
            }else{
                System.out.println("es menor de edad");   
            }
            System.out.println("¿Quiere seguir mostrando personas? Y/N");
            Respuesta = Leer.next();
            
        } while (Respuesta.equalsIgnoreCase("Y"));
    }
}
