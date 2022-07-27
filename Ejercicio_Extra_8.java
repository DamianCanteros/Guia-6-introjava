/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_8 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner (System.in);

        int i;
        int par=0;
        int impar=0;

        for (i = 1; i < 10; i++) {
            
            System.out.println("ingrese un número");
            int num = Leer.nextInt();
            
            if (num%2==0){
                par += 1;
            }else{
                impar += 1;
            }
            if (num%5==0){
                break;
            } 
        } 
        System.out.println("la cantidad de números leídos es " + i); 
        System.out.println("la cantidad de números pares es " + par);
        System.out.println("la cantidad de números impares es " + impar); 
    }
    
}
