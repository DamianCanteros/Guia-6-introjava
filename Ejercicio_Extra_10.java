/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_10 {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner Leer = new Scanner(System.in);
       
        
        double num1 = random.nextInt(11);
        double num2 = random.nextInt(11);
        int resultado;
        
        do {
            
            System.out.println("adivine el resultado de la multiplicación");
            resultado = Leer.nextInt();
            
            if (resultado != num1*num2) {
                
                System.out.println("el numero ingresado es incorrecto");
                            
            }
        } while (resultado != num1*num2);
        
        System.out.println("el numero ingresado es correcto, felicitaciones!!!");

        
    }
    
}
