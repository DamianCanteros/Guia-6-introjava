/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_9 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner (System.in);
            
        System.out.println("ingrese un número entero");
        int num1 = Leer.nextInt();
            
        System.out.println("ingrese otro número entero");
        int num2 = Leer.nextInt();

        Division(num1,num2);
            
    }
    
    public static void Division(int num1,int num2) {
        
        int i=0;
        
        do {
            
            i+=1;
            num1 = num1-num2;
            
        } while (num1>num2);
          
        System.out.println("el residuo es " +num1);
        System.out.println("el cociente es " +i);
    }
}
